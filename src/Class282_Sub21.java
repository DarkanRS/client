public class Class282_Sub21 extends Node {

	static NativeSprite[] aClass160Array7673;
	String aString7674;
	int anInt7675;

	static void method12353(int i_0, int i_1, int i_2, int i_3, boolean bool_4, int i_5) {
		long long_6 = (long) (i_0 | (bool_4 ? Integer.MIN_VALUE : 0));
		Class282_Sub30 class282_sub30_8 = (Class282_Sub30) Class282_Sub30.aClass465_7711.method7754(long_6);
		if (class282_sub30_8 == null) {
			class282_sub30_8 = new Class282_Sub30();
			Class282_Sub30.aClass465_7711.method7765(class282_sub30_8, long_6);
		}

		if (class282_sub30_8.anIntArray7710.length <= i_1) {
			int[] ints_9 = new int[i_1 + 1];
			int[] ints_10 = new int[i_1 + 1];

			int i_11;
			for (i_11 = 0; i_11 < class282_sub30_8.anIntArray7710.length; i_11++) {
				ints_9[i_11] = class282_sub30_8.anIntArray7710[i_11];
				ints_10[i_11] = class282_sub30_8.anIntArray7709[i_11];
			}

			for (i_11 = class282_sub30_8.anIntArray7710.length; i_11 < i_1; i_11++) {
				ints_9[i_11] = -1;
				ints_10[i_11] = 0;
			}

			class282_sub30_8.anIntArray7710 = ints_9;
			class282_sub30_8.anIntArray7709 = ints_10;
		}

		class282_sub30_8.anIntArray7710[i_1] = i_2;
		class282_sub30_8.anIntArray7709[i_1] = i_3;
	}

}
