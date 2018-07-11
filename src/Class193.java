/* Class193 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class193 {
	int anInt2393;
	short aShort2394;
	short aShort2395;
	short aShort2396;
	byte aByte2397;
	byte aByte2398;
	boolean aBool2399;
	int anInt2400;

	Class193(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, boolean bool, int i_8_) {
		((Class193) this).anInt2393 = -1274099887 * i;
		((Class193) this).aShort2394 = (short) i_3_;
		((Class193) this).aShort2395 = (short) i_4_;
		((Class193) this).aShort2396 = (short) i_5_;
		((Class193) this).aByte2398 = (byte) i_6_;
		((Class193) this).aByte2397 = (byte) i_7_;
		((Class193) this).aBool2399 = bool;
		((Class193) this).anInt2400 = i_8_ * 33256725;
	}

	static final void method3170(CS2Executor class527, int i) {
		boolean bool = false;
		if (client.aBool7310) {
			try {
				Object object = (Class361.aClass361_4178.method6254((new Object[] { Integer.valueOf(Class504.anInt5832 * 318997953), (Boolean.valueOf(1 == (Class84.myPlayer.male))), Integer.valueOf(class527.intStack[(class527.intStackPtr -= 141891001) * 1942118537]) }), (byte) 69));
				if (null != object)
					bool = ((Boolean) object).booleanValue();
			} catch (Throwable throwable) {
				/* empty */
			}
		}
		class527.intStack[(class527.intStackPtr += 141891001) * 1942118537 - 1] = bool ? 1 : 0;
	}

	static final void method3171(CS2Executor class527, byte i) {
		int i_9_ = (class527.intStack[(class527.intStackPtr -= 141891001) * 1942118537]);
		IComponentDefinitions class118 = Class117.method1981(i_9_, (byte) 105);
		Class209.method3601(class118, class527, -1995583516);
	}

	static final void method3172(CS2Executor class527, int i) {
		Class282_Sub29.method12426(1174367137);
	}
}
