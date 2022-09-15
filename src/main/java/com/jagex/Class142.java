package com.jagex;

public class Class142 {

	static float[] aFloatArray1666 = new float[16384];
	static float[] aFloatArray1665 = new float[16384];

	static {
		double d_0 = 3.834951969714103E-4D;

		for (int i_2 = 0; i_2 < 16384; i_2++) {
			aFloatArray1666[i_2] = (float) Math.sin(i_2 * d_0);
			aFloatArray1665[i_2] = (float) Math.cos(i_2 * d_0);
		}

	}

	Class142() throws Throwable {
		throw new Error();
	}

}
