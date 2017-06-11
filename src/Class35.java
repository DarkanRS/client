/* Class35 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class35 {
	static float[] aFloatArray417;
	static float[] aFloatArray418 = new float[16384];

	Class35() throws Throwable {
		throw new Error();
	}

	static {
		aFloatArray417 = new float[16384];
		double d = 3.834951969714103E-4;
		for (int i = 0; i < 16384; i++) {
			aFloatArray418[i] = (float) Math.sin((double) i * d);
			aFloatArray417[i] = (float) Math.cos((double) i * d);
		}
	}
}
