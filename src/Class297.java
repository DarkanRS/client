/* Class297 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class297 {
	static float[] aFloatArray3536;
	static float[] aFloatArray3537 = new float[16384];

	Class297() throws Throwable {
		throw new Error();
	}

	static {
		aFloatArray3536 = new float[16384];
		double d = 3.834951969714103E-4;
		for (int i = 0; i < 16384; i++) {
			aFloatArray3537[i] = (float) Math.sin((double) i * d);
			aFloatArray3536[i] = (float) Math.cos((double) i * d);
		}
	}
}
