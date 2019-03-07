public class Class423 {

	Class423() throws Throwable {
		throw new Error();
	}

	public static Class345 method7065(int i_0, int i_1) {
		Class345 class345_2 = (Class345) Class345.aClass229_4031.get((long) i_0);
		if (class345_2 != null) {
			return class345_2;
		} else {
			byte[] bytes_3 = Class345.aClass317_4021.getFile(1, i_0);
			class345_2 = new Class345();
			class345_2.anInt4032 = i_0;
			if (bytes_3 != null) {
				class345_2.method6124(new RsByteBuffer(bytes_3), (byte) -1);
			}

			class345_2.method6128((byte) 3);
			if (class345_2.anInt4041 == 2 && Class345.aClass465_4029.get((long) i_0) == null) {
				Class345.aClass465_4029.put(new Class282_Sub38(Class345.anInt4028), (long) i_0);
				Class345.aClass345Array4025[++Class345.anInt4028 - 1] = class345_2;
			}

			Class345.aClass229_4031.put(class345_2, (long) i_0);
			return class345_2;
		}
	}

	static final void method7066(int i_0, int i_1, int i_2, int i_3, int i_4, int i_5, byte b_6) {
		for (Class275_Sub6 class275_sub6_7 = (Class275_Sub6) client.aClass457_7335.method7659(301908602); class275_sub6_7 != null; class275_sub6_7 = (Class275_Sub6) client.aClass457_7335.method7650((byte) 39)) {
			if (client.cycles >= class275_sub6_7.anInt7858) {
				class275_sub6_7.method4887((byte) -23);
			} else {
				Class407.method6871(class275_sub6_7.anInt7857, (class275_sub6_7.anInt7859 << 9) + 256, (class275_sub6_7.anInt7854 << 9) + 256, class275_sub6_7.anInt7855 * 2, -1994365952);
				Class285.aClass8_3394.method360(class275_sub6_7.aString7860, (int) ((float) i_0 + client.aFloatArray7292[0]), (int) ((float) i_1 + client.aFloatArray7292[1]), ~0xffffff | class275_sub6_7.anInt7856, 0, 768492991);
			}
		}

	}

}
