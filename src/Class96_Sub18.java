
/* Class96_Sub18 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Arrays;

public class Class96_Sub18 extends Class96 {
	int anInt9395;
	int anInt9396;
	int[] anIntArray9397;
	int anInt9398;

	Class96_Sub18(RsByteBuffer class282_sub35) {
		super(class282_sub35);
		((Class96_Sub18) this).anInt9395 = class282_sub35.readUnsignedShort() * 1548991103;
		((Class96_Sub18) this).anIntArray9397 = new int[Class8_Sub3.method14339(1886074121).length];
		((Class96_Sub18) this).anInt9396 = class282_sub35.readBigSmart() * 185651677;
		Arrays.fill(((Class96_Sub18) this).anIntArray9397, 0, ((Class96_Sub18) this).anIntArray9397.length, 1590562421 * ((Class96_Sub18) this).anInt9396);
		((Class96_Sub18) this).anInt9398 = class282_sub35.readInt() * 933564729;
	}

	public void method1592(int i) {
		Animable class521_sub1_sub1_sub2 = Class82.aClass75Array804[1932395903 * ((Class96_Sub18) this).anInt9395].method1342((byte) 62);
		if (1684442377 * ((Class96_Sub18) this).anInt9398 == 0)
			Class20.animate(class521_sub1_sub1_sub2, ((Class96_Sub18) this).anIntArray9397, 0, false, (byte) -103);
		else
			Class331.method5923(class521_sub1_sub1_sub2, new int[] { ((Class96_Sub18) this).anInt9396 * 1590562421 }, new int[] { 0 }, new int[] { ((Class96_Sub18) this).anInt9398 * 1684442377 }, 1929963591);
	}

	boolean method1599(int i) {
		AnimationDefinitions class518 = IndexLoaders.aClass523_3868.method11205((1590562421 * (((Class96_Sub18) this).anInt9396)), (byte) -29);
		return class518.method11132(1999507141);
	}

	public void method1601() {
		Animable class521_sub1_sub1_sub2 = Class82.aClass75Array804[1932395903 * ((Class96_Sub18) this).anInt9395].method1342((byte) 78);
		if (1684442377 * ((Class96_Sub18) this).anInt9398 == 0)
			Class20.animate(class521_sub1_sub1_sub2, ((Class96_Sub18) this).anIntArray9397, 0, false, (byte) 7);
		else
			Class331.method5923(class521_sub1_sub1_sub2, new int[] { ((Class96_Sub18) this).anInt9396 * 1590562421 }, new int[] { 0 }, new int[] { ((Class96_Sub18) this).anInt9398 * 1684442377 }, 1894867046);
	}

	boolean method1596() {
		AnimationDefinitions class518 = IndexLoaders.aClass523_3868.method11205((1590562421 * (((Class96_Sub18) this).anInt9396)), (byte) 4);
		return class518.method11132(2038902723);
	}

	boolean method1591() {
		AnimationDefinitions class518 = IndexLoaders.aClass523_3868.method11205((1590562421 * (((Class96_Sub18) this).anInt9396)), (byte) 23);
		return class518.method11132(1964744017);
	}

	static final void method14664(IComponentDefinitions class118, Interface class98, boolean bool, int i, CS2Executor class527, byte i_0_) {
		class527.anInt7012 -= 283782002;
		int i_1_ = (class527.intStack[1942118537 * class527.anInt7012]);
		int i_2_ = (class527.intStack[class527.anInt7012 * 1942118537 + 1]);
		if (-1 == class118.anInt1288 * 1924549737 && !class98.aBool999) {
			Class411.method6914(class118.idHash * -1952846363, (short) 887);
			Class106.method1818(class118.idHash * -1952846363, 209948825);
			Item.method12575(-1952846363 * class118.idHash, (byte) 59);
		}
		if (-1 == i_1_) {
			class118.anInt1329 = 589750077;
			class118.anInt1330 = 636815827;
			class118.anInt1426 = 833742903;
		} else {
			class118.anInt1426 = i_1_ * -833742903;
			class118.anInt1427 = i_2_ * 1010829041;
			class118.aBool1388 = bool;
			ItemDefinitions class425 = IndexLoaders.ITEM_INDEX_LOADER.getItemDefinitions(i_1_, 501470763);
			class118.anInt1385 = -790145187 * class425.anInt5058;
			class118.anInt1336 = 427762477 * class425.anInt5045;
			class118.anInt1337 = -174540793 * class425.anInt5074;
			class118.anInt1293 = class425.anInt5063 * -1057479355;
			class118.anInt1334 = class425.anInt5044 * -1474252971;
			class118.anInt1343 = class425.modelZoom * 394720705;
			class118.anInt1335 = i * 582441359;
			if (class118.anInt1417 * -1326245411 > 0)
				class118.anInt1343 = (class118.anInt1343 * 1787365152 / (-1326245411 * class118.anInt1417) * -807852535);
			else if (class118.anInt1297 * 1352091441 > 0)
				class118.anInt1343 = -807852535 * (class118.anInt1343 * 1787365152 / (1352091441 * class118.anInt1297));
		}
	}
}
