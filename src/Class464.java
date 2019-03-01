public final class Class464 {

	static String aString5555;
	public static boolean aBool5556;
	Class275_Sub1 aClass275_Sub1_5553;
	public Class275_Sub1 aClass275_Sub1_5554 = new Class275_Sub1();

	public Class275_Sub1 method7731(int i_1) {
		Class275_Sub1 class275_sub1_2 = this.aClass275_Sub1_5554.aClass275_Sub1_7706;
		if (class275_sub1_2 == this.aClass275_Sub1_5554) {
			this.aClass275_Sub1_5553 = null;
			return null;
		} else {
			this.aClass275_Sub1_5553 = class275_sub1_2.aClass275_Sub1_7706;
			return class275_sub1_2;
		}
	}

	public Class275_Sub1 method7734(byte b_1) {
		Class275_Sub1 class275_sub1_2 = this.aClass275_Sub1_5553;
		if (class275_sub1_2 == this.aClass275_Sub1_5554) {
			this.aClass275_Sub1_5553 = null;
			return null;
		} else {
			this.aClass275_Sub1_5553 = class275_sub1_2.aClass275_Sub1_7706;
			return class275_sub1_2;
		}
	}

	public void method7735(Class275_Sub1 class275_sub1_1, int i_2) {
		if (class275_sub1_1.aClass275_Sub1_7707 != null) {
			class275_sub1_1.method12423((byte) -20);
		}

		class275_sub1_1.aClass275_Sub1_7707 = this.aClass275_Sub1_5554.aClass275_Sub1_7707;
		class275_sub1_1.aClass275_Sub1_7706 = this.aClass275_Sub1_5554;
		class275_sub1_1.aClass275_Sub1_7707.aClass275_Sub1_7706 = class275_sub1_1;
		class275_sub1_1.aClass275_Sub1_7706.aClass275_Sub1_7707 = class275_sub1_1;
	}

	public int method7736(int i_1) {
		int i_2 = 0;

		for (Class275_Sub1 class275_sub1_3 = this.aClass275_Sub1_5554.aClass275_Sub1_7706; class275_sub1_3 != this.aClass275_Sub1_5554; class275_sub1_3 = class275_sub1_3.aClass275_Sub1_7706) {
			++i_2;
		}

		return i_2;
	}

	public void method7740(int i_1) {
		while (true) {
			Class275_Sub1 class275_sub1_2 = this.aClass275_Sub1_5554.aClass275_Sub1_7706;
			if (class275_sub1_2 == this.aClass275_Sub1_5554) {
				this.aClass275_Sub1_5553 = null;
				return;
			}

			class275_sub1_2.method12423((byte) -118);
		}
	}

	public Class464() {
		this.aClass275_Sub1_5554.aClass275_Sub1_7706 = this.aClass275_Sub1_5554;
		this.aClass275_Sub1_5554.aClass275_Sub1_7707 = this.aClass275_Sub1_5554;
	}

	static boolean method7742(int i_0, byte b_1) {
		return i_0 == 11 || i_0 == 2 || i_0 == 18 || i_0 == 6 || i_0 == 9;
	}

	static final void method7743(IComponentDefinitions[] arr_0, int i_1, byte b_2) {
		for (int i_3 = 0; i_3 < arr_0.length; i_3++) {
			IComponentDefinitions icomponentdefinitions_4 = arr_0[i_3];
			if (icomponentdefinitions_4 != null && icomponentdefinitions_4.anInt1305 == i_1 && !client.method11651(icomponentdefinitions_4)) {
				if (icomponentdefinitions_4.anInt1268 == 0) {
					method7743(arr_0, icomponentdefinitions_4.idHash, (byte) 10);
					if (icomponentdefinitions_4.aClass118Array1439 != null) {
						method7743(icomponentdefinitions_4.aClass118Array1439, icomponentdefinitions_4.idHash, (byte) 10);
					}

					Class282_Sub44 class282_sub44_5 = (Class282_Sub44) client.aClass465_7442.get((long) icomponentdefinitions_4.idHash);
					if (class282_sub44_5 != null) {
						UnderlayDefinition.method8777(class282_sub44_5.anInt8063, (byte) -57);
					}
				}

				if (icomponentdefinitions_4.anInt1268 == 6 && icomponentdefinitions_4.anInt1321 != -1) {
					if (icomponentdefinitions_4.aClass456_1437 == null) {
						icomponentdefinitions_4.aClass456_1437 = new Class456_Sub1();
						icomponentdefinitions_4.aClass456_1437.method7567(icomponentdefinitions_4.anInt1321, (short) 8960);
					}

					if (icomponentdefinitions_4.aClass456_1437.method7627(client.anInt7261, 1231441216) && icomponentdefinitions_4.aClass456_1437.method7580(602854407)) {
						icomponentdefinitions_4.aClass456_1437.method7582((byte) -59);
					}
				}
			}
		}

	}

	static final void method7744(CS2Executor cs2executor_0, int i_1) {
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = Class9.anInt94;
	}

}
