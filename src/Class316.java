import java.util.Date;
import java.util.Random;

public class Class316 {

	static Class223 aClass223_3679 = new Class223(16);

	public static int[] anIntArray3677;

	public static int[] anIntArray3675;

	public static int[] anIntArray3672;

	public static int anInt3669;

	public static int anInt3670;

	public static int anInt3678;

	public static int[] anIntArray3668;

	public static int anInt3673;

	public static int anInt3671;

	public static void method5586(byte b_0) {
		if (anIntArray3677 == null || anIntArray3675 == null) {
			anIntArray3677 = new int[256];
			anIntArray3675 = new int[256];
			for (int i_1 = 0; i_1 < 256; i_1++) {
				double d_2 = 6.283185307179586D * ((double) i_1 / 255.0D);
				anIntArray3677[i_1] = (int) (Math.sin(d_2) * 4096.0D);
				anIntArray3675[i_1] = (int) (Math.cos(d_2) * 4096.0D);
			}
		}
	}

	public static byte[] method5588(int i_0, int i_1) {
		CacheableNode_Sub2 class282_sub50_sub2_2 = (CacheableNode_Sub2) aClass223_3679.method3758((long) i_0);
		if (class282_sub50_sub2_2 == null) {
			byte[] bytes_3 = new byte[512];
			Random random_4 = new Random((long) i_0);
			int i_5;
			for (i_5 = 0; i_5 < 255; i_5++) {
				bytes_3[i_5] = (byte) i_5;
			}
			for (i_5 = 0; i_5 < 255; i_5++) {
				int i_6 = 255 - i_5;
				int i_7 = Class476.method7931(random_4, i_6, 1472489211);
				byte b_8 = bytes_3[i_7];
				bytes_3[i_7] = bytes_3[i_6];
				bytes_3[i_6] = bytes_3[511 - i_5] = b_8;
			}
			class282_sub50_sub2_2 = new CacheableNode_Sub2(bytes_3);
			aClass223_3679.method3759(class282_sub50_sub2_2, (long) i_0);
		}
		return class282_sub50_sub2_2.aByteArray9472;
	}

	Class316() throws Throwable {
		throw new Error();
	}

	public static void method5593(int i_0, int i_1, int i_2) {
		int i_3;
		if (i_0 != anInt3670) {
			anIntArray3672 = new int[i_0];
			for (i_3 = 0; i_3 < i_0; i_3++) {
				anIntArray3672[i_3] = (i_3 << 12) / i_0;
			}
			anInt3669 = i_0 - 1;
			anInt3670 = i_0;
			anInt3678 = i_0 * 32;
		}
		if (anInt3671 != i_1) {
			if (anInt3670 != i_1) {
				anIntArray3668 = new int[i_1];
				for (i_3 = 0; i_3 < i_1; i_3++) {
					anIntArray3668[i_3] = (i_3 << 12) / i_1;
				}
			} else {
				anIntArray3668 = anIntArray3672;
			}
			anInt3673 = i_1 - 1;
			anInt3671 = i_1;
		}
	}

	public static void method5594() {
		Class404.method6810(1208455577);
		Class20.aBool161 = false;
		Class292.method5201(Class301.anInt3555, BufferedConnectionContext.anInt2300, Class158_Sub2.anInt8975, Class110.anInt1104);
		CutsceneAction_Sub23.aCacheableNode_Sub7_9445 = null;
		Class20.aCacheableNode_Sub7_168 = null;
	}

	static String method5596(long long_0) {
		return Class78.method1372(new Date(long_0), "EEE dd-MMM-yyyy HH:mm:ss zzz");
	}

	static void method5599(int i_0) {
		Class475.anInt5624 = i_0;
		Class291_Sub1.anInt8016 = -1;
		Class291_Sub1.anInt8016 = -1;
		Class89.method1502(-536865133);
	}
}
