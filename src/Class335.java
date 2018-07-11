/* Class335 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class335 {
	RsBitsBuffer buffer;
	Class256 aClass256_3915;
	public static int[] anIntArray3916;

	public Class335(Class256 class256, RsBitsBuffer class282_sub35_sub2) {
		((Class335) this).aClass256_3915 = class256;
		((Class335) this).buffer = class282_sub35_sub2;
	}

	static void method5961(int i) {
		if (Class260.aClass277_3221 != null) {
			Vector3 class385 = Vector3.method6623(Class84.myPlayer.method11166().aClass385_3595);
			CoordGrid class219 = IndexLoaders.MAP_REGION_DECODER.getCoordGrid(898248165);
			class385.x += (float) (class219.x * 1948093437 << 9);
			class385.z += (float) (class219.y * -1002240017 << 9);
			class385.subtract((float) (((Class277) Class260.aClass277_3221).anInt3349 * -142397055), class385.y, (float) (-1830451005 * ((Class277) Class260.aClass277_3221).anInt3348));
			float f = class385.magnitude();
			class385.method6624();
			float f_0_ = 0.0F;
			if (f < (float) (((Class277) Class260.aClass277_3221).anInt3351 * -495770161))
				f_0_ = 1.0F;
			else if (f > (float) (-453376919 * (((Class277) Class260.aClass277_3221).anInt3350)))
				f_0_ = 0.0F;
			else {
				f -= (float) (-495770161 * (((Class277) Class260.aClass277_3221).anInt3351));
				f_0_ = 1.0F - f / (float) ((((Class277) Class260.aClass277_3221).anInt3347) * -809965967);
			}
			Class187.method3121((int) (f_0_ * 256.0F), (short) 13053);
		}
	}

	static final void method5962(CS2Executor class527, byte i) {
		class527.intStackPtr -= 425673003;
		int i_1_ = (class527.intStack[class527.intStackPtr * 1942118537]);
		int i_2_ = (class527.intStack[1 + 1942118537 * class527.intStackPtr]);
		int i_3_ = (class527.intStack[2 + 1942118537 * class527.intStackPtr]);
		Class117.method1981(i_1_, (byte) 55);
		Class159.method2738(Class468_Sub8.aClass98Array7889[i_1_ >>> 16], i_1_ & 0xffff, i_2_, i_3_, class527.aBool7022, class527, -1306169472);
	}

	public static Class466[] method5963(int i) {
		return (new Class466[] { Class466.aClass466_5564, Class466.aClass466_5567, Class466.aClass466_5568, Class466.aClass466_5563, Class466.aClass466_5569, Class466.aClass466_5565 });
	}
}
