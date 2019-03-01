public class Class254_Sub1 extends Class254 implements Runnable {

	public void run() {
		this.aBool3144 = true;

		try {
			try {
				while (!this.aBool3143) {
					for (int i_1 = 0; i_1 < 2; i_1++) {
						Class253 class253_2 = this.aClass253Array3142[i_1];
						if (class253_2 != null) {
							class253_2.method4333();
						}
					}

					Class89.sleep(10L);
					Class282_Sub20_Sub27.method15395((Object) null, -398672948);
				}
			} catch (Exception exception_4) {
				Class151.method2594((String) null, exception_4, (byte) -37);
				this.aBool3144 = false;
				return;
			}

			this.aBool3144 = false;
		} catch (Exception exception_5) {
			this.aBool3144 = false;
		}

	}

}
