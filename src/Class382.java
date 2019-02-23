public class Class382 {

	public static int[] anIntArray4657 = new int[16384];
	public static int[] anIntArray4661 = new int[16384];

	static {
		double d_0 = 3.834951969714103E-4D;

		for (int i_2 = 0; i_2 < 16384; i_2++) {
			anIntArray4657[i_2] = (int) (16384.0D * Math.sin((double) i_2 * d_0));
			anIntArray4661[i_2] = (int) (16384.0D * Math.cos((double) i_2 * d_0));
		}

	}

	Class382() throws Throwable {
		throw new Error();
	}

	public static float method6508(int i_0) {
		i_0 &= 0x3fff;
		return (float) ((double) ((float) i_0 / 16384.0F) * 6.283185307179586D);
	}

}
