public class Class335 {

	public static int[] anIntArray3916;
	Class256 aClass256_3915;
	RsBitsBuffer buffer;

	public Class335(Class256 class256_1, RsBitsBuffer rsbitsbuffer_2) {
		this.aClass256_3915 = class256_1;
		this.buffer = rsbitsbuffer_2;
	}

	static void method5961(int i_0) {
		if (Class260.aClass277_3221 != null) {
			Vector3 vector3_1 = Vector3.popVectorStackTo(Class84.myPlayer.method11166().aClass385_3595);
			CoordGrid coordgrid_2 = IndexLoaders.MAP_REGION_DECODER.getCoordGrid(898248165);
			vector3_1.x += (float) (coordgrid_2.x << 9);
			vector3_1.z += (float) (coordgrid_2.y << 9);
			vector3_1.subtract((float) Class260.aClass277_3221.anInt3349, vector3_1.y, (float) Class260.aClass277_3221.anInt3348);
			float f_3 = vector3_1.magnitude();
			vector3_1.pushVectorStack();
			float f_4 = 0.0F;
			if (f_3 < (float) Class260.aClass277_3221.anInt3351) {
				f_4 = 1.0F;
			} else if (f_3 > (float) Class260.aClass277_3221.anInt3350) {
				f_4 = 0.0F;
			} else {
				f_3 -= (float) Class260.aClass277_3221.anInt3351;
				f_4 = 1.0F - f_3 / (float) Class260.aClass277_3221.anInt3347;
			}

			Class187.method3121((int) (f_4 * 256.0F), (short) 13053);
		}

	}

	static final void method5962(CS2Executor cs2executor_0, byte b_1) {
		cs2executor_0.intStackPtr -= 3;
		int i_2 = cs2executor_0.intStack[cs2executor_0.intStackPtr];
		int i_3 = cs2executor_0.intStack[cs2executor_0.intStackPtr + 1];
		int i_4 = cs2executor_0.intStack[cs2executor_0.intStackPtr + 2];
		Class117.method1981(i_2, (byte) 55);
		Class159.method2738(Class468_Sub8.aClass98Array7889[i_2 >>> 16], i_2 & 0xffff, i_3, i_4, cs2executor_0.aBool7022, cs2executor_0, -1306169472);
	}

	public static Class466[] method5963(int i_0) {
		return new Class466[] { Class466.aClass466_5564, Class466.aClass466_5567, Class466.aClass466_5568, Class466.aClass466_5563, Class466.aClass466_5569, Class466.aClass466_5565 };
	}

}
