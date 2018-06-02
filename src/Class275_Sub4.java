/* Class275_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class275_Sub4 extends Class275 {
	String aString7837;
	int anInt7838 = (int) (Class169.method2869(1747469156) / 1000L) * -793612871;
	short aShort7839;

	Class275_Sub4(String string, int i) {
		((Class275_Sub4) this).aString7837 = string;
		((Class275_Sub4) this).aShort7839 = (short) i;
	}

	static final void method12585(Class282_Sub31 class282_sub31, int i) {
		SceneObjectManager class206 = IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager(-1869632062);
		if (class206 != null) {
			SceneObject interface12 = null;
			if (0 == ((Class282_Sub31) class282_sub31).anInt7766 * -497894501)
				interface12 = ((SceneObject) class206.getWall(1291499461 * (((Class282_Sub31) class282_sub31).anInt7764), 37618455 * class282_sub31.anInt7762, (-322610393 * class282_sub31.anInt7763), (byte) 0));
			if (-497894501 * ((Class282_Sub31) class282_sub31).anInt7766 == 1)
				interface12 = ((SceneObject) class206.getWallDecoration(1291499461 * (((Class282_Sub31) class282_sub31).anInt7764), 37618455 * class282_sub31.anInt7762, (class282_sub31.anInt7763 * -322610393), (byte) -42));
			if (2 == ((Class282_Sub31) class282_sub31).anInt7766 * -497894501)
				interface12 = ((SceneObject) class206.getInteractableObject(1291499461 * (((Class282_Sub31) class282_sub31).anInt7764), 37618455 * class282_sub31.anInt7762, (-322610393 * class282_sub31.anInt7763), client.anInterface25_7446, -233664382));
			if (-497894501 * ((Class282_Sub31) class282_sub31).anInt7766 == 3)
				interface12 = ((SceneObject) class206.getGroundDecoration((((Class282_Sub31) class282_sub31).anInt7764) * 1291499461, class282_sub31.anInt7762 * 37618455, (class282_sub31.anInt7763 * -322610393), -387297653));
			if (null != interface12) {
				((Class282_Sub31) class282_sub31).anInt7765 = interface12.getId(109923272) * -233992759;
				((Class282_Sub31) class282_sub31).anInt7770 = interface12.method89(696925802) * 1474006371;
				((Class282_Sub31) class282_sub31).anInt7767 = interface12.method92(-1676463957) * 566178073;
			} else {
				((Class282_Sub31) class282_sub31).anInt7765 = 233992759;
				((Class282_Sub31) class282_sub31).anInt7770 = 0;
				((Class282_Sub31) class282_sub31).anInt7767 = 0;
			}
		}
	}

	static final void method12586(CS2Executor class527, short i) {
		class527.anInt7012 -= 425673003;
		int i_0_ = (class527.intStack[1942118537 * class527.anInt7012]);
		int i_1_ = (class527.intStack[1 + class527.anInt7012 * 1942118537]);
		int i_2_ = (class527.intStack[2 + 1942118537 * class527.anInt7012]);
		Class159.method2738((class527.animable.aClass98_10324), i_0_ & 0xffff, i_1_, i_2_, class527.aBool7022, class527, -1306169472);
	}

	static void method12587(CS2Executor class527, byte i) {
		class527.intStack[class527.anInt7012 * 1942118537 - 2] = (IndexLoaders.aClass242_4922.method4156((class527.intStack[1942118537 * class527.anInt7012 - 2]), -1396181317).method4105(Class158_Sub1.aClass3_8507, (class527.intStack[1942118537 * class527.anInt7012 - 1]), 93625804)) ? 1 : 0;
		class527.anInt7012 -= 141891001;
	}
}
