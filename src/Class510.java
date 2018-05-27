/* Class510 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class Class510 {
	volatile String aString5871;
	public volatile int anInt5872 = -624679881;

	Class510(String string) {
		((Class510) this).aString5871 = string;
	}

	static final void method8741(CS2Executor class527, int i) {
		int i_0_ = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i_0_, (byte) 19);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i_0_ >> 16];
		Class30.method797(class118, class98, class527, 2057644852);
	}

	static final void method8742(CS2Executor class527, int i) {
		Class275_Sub7.method12606((byte) 70);
	}

	static final void method8743(CS2Executor class527, int i) {
		if (-1837903909 * class527.anInt7002 != 0) {
			Class509 class509 = (class527.aClass509Array7016[(class527.anInt7002 -= -72641453) * -1837903909]);
			class527.current = ((Class509) class509).aClass282_Sub50_Sub5_5869;
			class527.operations = (class527.current.operations);
			class527.unknown = (class527.current.intOpValues);
			class527.instrPtr = ((Class509) class509).anInt5866 * -390085499;
			class527.intLocals = ((Class509) class509).anIntArray5867;
			class527.objectLocals = ((Class509) class509).anObjectArray5865;
			class527.aLongArray6996 = ((Class509) class509).aLongArray5868;
		}
	}

	static final void method8744(byte i, int i_1_) {
		byte[][][] is = IndexLoaders.MAP_REGION_DECODER.method4532(1227540505);
		if (is == null) {
			is = (new byte[4][IndexLoaders.MAP_REGION_DECODER.method4424(1852995764)][IndexLoaders.MAP_REGION_DECODER.method4451(-533095676)]);
			IndexLoaders.MAP_REGION_DECODER.method4440(is, (byte) 2);
		}
		for (int i_2_ = 0; i_2_ < 4; i_2_++) {
			for (int i_3_ = 0; i_3_ < IndexLoaders.MAP_REGION_DECODER.method4424(713986087); i_3_++) {
				for (int i_4_ = 0; i_4_ < IndexLoaders.MAP_REGION_DECODER.method4451(-748380927); i_4_++)
					is[i_2_][i_3_][i_4_] = i;
			}
		}
	}
}
