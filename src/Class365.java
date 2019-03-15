public class Class365 implements Interface3 {

	public int anInt4229;
	public Class356 aClass356_4225;
	public Class353 aClass353_4226;
	public int anInt4221;
	public int anInt4223;
	public int anInt4227;
	public int anInt4228;
	public int anInt4224;
	public int anInt4222;
	public int anInt4220;
	public boolean aBool4230;

	public Class60 method25() {
		return Class60.aClass60_605;
	}

	public Class60 method24() {
		return Class60.aClass60_605;
	}

	Class365(int i_1, Class356 class356_2, Class353 class353_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9, int i_10, boolean bool_11) {
		this.anInt4229 = i_1;
		this.aClass356_4225 = class356_2;
		this.aClass353_4226 = class353_3;
		this.anInt4221 = i_4;
		this.anInt4223 = i_5;
		this.anInt4227 = i_6;
		this.anInt4228 = i_7;
		this.anInt4224 = i_8;
		this.anInt4222 = i_9;
		this.anInt4220 = i_10;
		this.aBool4230 = bool_11;
	}

	public static void setGameState(int state) {
		if (state != client.gameState) {
			client.anInt7396 = 0;
			if (state == 10 || state == 17) {
				Class78.method1384();
			}

			if (state != 10 && Class233.aClass202_2883 != null) {
				Class233.aClass202_2883.method3318(1798206755);
				Class233.aClass202_2883 = null;
			}

			if (state == 5) {
				Class348.method6175(client.gameState == 3 || client.gameState == 8 || client.anInt7349 != Class58.aClass529_527.anInt7036, 618699905);
			}

			if (state == 0) {
				Class346.method6161(client.anInt7349 != Class58.aClass529_527.anInt7027);
			}

			if (state != 14 && state != 12) {
				if (state == 19 || state == 7 && client.gameState != 6) {
					Class78.method1384();
				} else if (state == 8) {
					Class247.method4251();
				}
			} else {
				Class331.method5921();
			}

			if (Class464.method7742(state, (byte) 74)) {
				IndexLoaders.MAP_REGION_DECODER.method4445((byte) -22);
				Class122.method2111(true);
			}

			if (state == 18 || state == 5) {
				Class60.method1172(280036334);
			}

			boolean bool_2 = state == 1 || Class97.loggedOutState(state) || Class282_Sub17.lobbyState(state, -2143190341);
			boolean bool_3 = client.gameState == 1 || Class97.loggedOutState(client.gameState) || Class282_Sub17.lobbyState(client.gameState, -2129908537);
			if (bool_2 != bool_3) {
				if (bool_2) {
					Class260.anInt3223 = Class260.anInt3228;
					if (Class393.preferences.aClass468_Sub13_8229.method12714(-1591414492) != 0) {
						Class339.method6047(IndexLoaders.MUSIC_INDEX, Class260.anInt3228, Class393.preferences.aClass468_Sub13_8229.method12714(695261258));
						Class468_Sub6.method12658(935417586);
					} else {
						Class358.method6240(1276678940);
					}

					Class119.JS5_STANDARD_REQUESTER.method5523(false, (byte) 123);
				} else {
					Class358.method6240(1962133181);
					Class119.JS5_STANDARD_REQUESTER.method5523(true, (byte) 44);
				}
			}

			if (Class464.method7742(state, (byte) 48) || state == 10 || state == 17) {
				Renderers.SOFTWARE_RENDERER.method8420();
			}

			client.gameState = state;
		}

	}

	public static void method6299(int i_0, boolean bool_1, int i_2, boolean bool_3) {
		Class52.method1086(0, Class448.aClass217_Sub1Array5426.length - 1, i_0, bool_1, i_2, bool_3, (byte) -100);
		Class448.anInt5430 = 0;
		Class448.aClass510_5423 = null;
	}

}
