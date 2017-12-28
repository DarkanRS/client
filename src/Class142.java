/* Class142 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class142 {
	static float[] aFloatArray1665;
	static float[] aFloatArray1666 = new float[16384];

	Class142() throws Throwable {
		throw new Error();
	}

	static {
		aFloatArray1665 = new float[16384];
		double d = 3.834951969714103E-4;
		for (int i = 0; i < 16384; i++) {
			aFloatArray1666[i] = (float) Math.sin((double) i * d);
			aFloatArray1665[i] = (float) Math.cos((double) i * d);
		}
	}
}
