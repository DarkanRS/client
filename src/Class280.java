public class Class280 implements Interface25 {

	Transform_Sub1_Sub1_Sub1 aTransform_Sub1_Sub1_Sub1_3371;

	public boolean method182(Transform_Sub1_Sub1 class521_sub1_sub1_1) {
		return class521_sub1_sub1_1 == this.aTransform_Sub1_Sub1_Sub1_3371;
	}

	public boolean method183(Transform_Sub1_Sub1 class521_sub1_sub1_1) {
		return class521_sub1_sub1_1 == this.aTransform_Sub1_Sub1_Sub1_3371;
	}

	Class280(Transform_Sub1_Sub1_Sub1 class521_sub1_sub1_sub1_1) {
		this.aTransform_Sub1_Sub1_Sub1_3371 = class521_sub1_sub1_sub1_1;
	}

	static final void method4974(long long_0) {
		int i_2 = client.anInt7262;
		int i_3 = client.anInt7376;
		int i_4;
		int i_5;
		if (i_2 != Class11.anInt122) {
			i_4 = i_2 - Class11.anInt122;
			i_5 = (int) ((long) i_4 * long_0 / 320L);
			if (i_4 > 0) {
				if (i_5 == 0) {
					i_5 = 1;
				} else if (i_5 > i_4) {
					i_5 = i_4;
				}
			} else if (i_5 == 0) {
				i_5 = -1;
			} else if (i_5 < i_4) {
				i_5 = i_4;
			}
			Class11.anInt122 += i_5;
		}
		if (i_3 != Class266.anInt3289) {
			i_4 = i_3 - Class266.anInt3289;
			i_5 = (int) ((long) i_4 * long_0 / 320L);
			if (i_4 > 0) {
				if (i_5 == 0) {
					i_5 = 1;
				} else if (i_5 > i_4) {
					i_5 = i_4;
				}
			} else if (i_5 == 0) {
				i_5 = -1;
			} else if (i_5 < i_4) {
				i_5 = i_4;
			}
			Class266.anInt3289 += i_5;
		}
		client.aFloat7365 += 8.0F * (client.aFloat7266 * (float) long_0 / 40.0F);
		client.aFloat7146 += 8.0F * ((float) long_0 * client.aFloat7284 / 40.0F);
		IsaacCipher.method7268(1874031200);
	}

	public static boolean method4975(String string_0) {
		if (string_0 == null) {
			return false;
		} else {
			for (int i_2 = 0; i_2 < client.anInt7373; i_2++) {
				Class10 class10_3 = client.aClass10Array7456[i_2];
				if (string_0.equalsIgnoreCase(class10_3.aString115)) {
					return true;
				}
				if (string_0.equalsIgnoreCase(class10_3.aString116)) {
					return true;
				}
			}
			return false;
		}
	}
}
