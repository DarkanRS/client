package com.jagex;

public class Trig {

	public static int[] SINE = new int[16384];
	public static int[] COSINE = new int[16384];

	static {
		double step = 3.834951969714103E-4D;

		for (int i = 0; i < 16384; i++) {
			SINE[i] = (int) (16384.0D * Math.sin(i * step));
			COSINE[i] = (int) (16384.0D * Math.cos(i * step));
		}

	}

	public static float degToRad(int i) {
		i &= 0x3fff;
		return (float) (i / 16384.0F * 6.283185307179586);
	}

	Trig() throws Throwable {
		throw new Error();
	}

}
