public class Class386 {

	Class386() throws Throwable {
		throw new Error();
	}

	public static Class467[] method6671(Class470 class470_0, int i_1) {
		int[] ints_2 = class470_0.method7807((byte) 0);
		Class467[] arr_3 = new Class467[ints_2.length >> 2];
		for (int i_4 = 0; i_4 < arr_3.length; i_4++) {
			Class467 class467_5 = new Class467();
			arr_3[i_4] = class467_5;
			class467_5.anInt5571 = ints_2[i_4 << 2];
			class467_5.anInt5574 = ints_2[(i_4 << 2) + 1];
			class467_5.anInt5573 = ints_2[(i_4 << 2) + 2];
			class467_5.anInt5572 = ints_2[(i_4 << 2) + 3];
		}
		return arr_3;
	}

	public static Interface43 method6672(Interface43[] arr_0, int i_1, int i_2) {
		Interface43[] arr_3 = arr_0;
		for (int i_4 = 0; i_4 < arr_3.length; i_4++) {
			Interface43 interface43_5 = arr_3[i_4];
			if (i_1 == interface43_5.method243((byte) 1)) {
				return interface43_5;
			}
		}
		return null;
	}

	public static void method6673(int i_0) {
		if (Class302.anInterface27Array3559 != null) {
			Interface27[] arr_1 = Class302.anInterface27Array3559;
			for (int i_2 = 0; i_2 < arr_1.length; i_2++) {
				Interface27 interface27_3 = arr_1[i_2];
				interface27_3.method161(-1145558933);
			}
		}
	}
}
