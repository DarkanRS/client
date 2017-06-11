/* Class215 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class215 {
	static float[] aFloatArray2449 = new float[16384];
	static float[] aFloatArray2450 = new float[16384];

	static {
		double d = 3.834951969714103E-4;
		for (int i = 0; i < 16384; i++) {
			aFloatArray2449[i] = (float) Math.sin((double) i * d);
			aFloatArray2450[i] = (float) Math.cos((double) i * d);
		}
	}

	Class215() throws Throwable {
		throw new Error();
	}
}
