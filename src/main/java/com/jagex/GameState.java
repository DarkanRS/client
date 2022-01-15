package com.jagex;

public enum GameState {

	UNK_0, UNK_1, UNK_2, IN_ACCOUNT_CREATION, UNK_4, UNK_5, UNK_6, UNK_7, UNK_8, UNK_9, UNK_10, UNK_11, UNK_12, UNK_13, UNK_14, UNK_15, UNK_16, UNK_17, UNK_18, UNK_19, UNK_20, UNK_21;

	public static boolean inLobby(GameState state) {
		switch (state) {
		case UNK_0:
		case UNK_2:
		case UNK_6:
		case UNK_7:
			return true;
		default:
			return false;
		}
	}

	public static boolean loggedOut(GameState state) {
		switch (state) {
		case IN_ACCOUNT_CREATION:
		case UNK_5:
		case UNK_8:
		case UNK_9:
		case UNK_11:
		case UNK_14:
		case UNK_19:
			return true;
		default:
			return false;
		}
	}

	static boolean method7742(GameState state) {
		switch (state) {
		case UNK_2:
		case UNK_6:
		case UNK_9:
		case UNK_11:
		case UNK_18:
			return true;
		default:
			return false;
		}
	}

	public static boolean loggedIn(GameState state) {
		switch (state) {
		case UNK_12:
		case UNK_13:
		case UNK_18:
			return true;
		default:
			return false;
		}
	}

	static boolean loadingState(GameState state) {
		switch (state) {
		case UNK_1:
		case UNK_4:
		case UNK_15:
			return true;
		default:
			return false;
		}
	}

	static boolean method4198(GameState state) {
		switch (state) {
		case IN_ACCOUNT_CREATION:
		case UNK_5:
		case UNK_8:
		case UNK_9:
		case UNK_14:
		case UNK_19:
			return true;
		default:
			return false;
		}
	}
	
	static boolean method5789(GameState state) {
		switch (state) {
		case UNK_0:
		case UNK_7:
			return true;
		default:
			return false;
		}
	}

	static boolean method2980(GameState state) {
		switch (state) {
		case UNK_0:
		case UNK_5:
		case UNK_7:
		case UNK_13:
			return true;
		default:
			return false;
		}
	}
	
	static boolean method4180(GameState state) {
	    return state == GameState.UNK_7 || state == GameState.UNK_6;
	}

	public static void setGameState(GameState state) {
		if (state != client.GAME_STATE) {
			client.anInt7396 = 0;
			if (state == GameState.UNK_10 || state == GameState.UNK_17) {
				Class78.method1384();
			}

			if (state != GameState.UNK_10 && ClanVarSettingsIndexLoader.aClass202_2883 != null) {
				ClanVarSettingsIndexLoader.aClass202_2883.end();
				ClanVarSettingsIndexLoader.aClass202_2883 = null;
			}

			if (state == GameState.UNK_5) {
				Class348.method6175(client.GAME_STATE == GameState.IN_ACCOUNT_CREATION || client.GAME_STATE == GameState.UNK_8 || client.BASE_WINDOW_ID != QuickchatFiller.ENTITY_DEFAULTS.loginWindow);
			}

			if (state == GameState.UNK_0) {
				QuickChatMessage.method6161(client.BASE_WINDOW_ID != QuickchatFiller.ENTITY_DEFAULTS.lobbyWindow);
			}

			if (state != GameState.UNK_14 && state != GameState.UNK_12) {
				if (state == GameState.UNK_19 || state == GameState.UNK_7 && client.GAME_STATE != GameState.UNK_6) {
					Class78.method1384();
				} else if (state == GameState.UNK_8) {
					Class247.method4251();
				}
			} else {
				QuickchatCategoryLoader.method5921();
			}

			if (method7742(state)) {
				IndexLoaders.MAP_REGION_DECODER.method4445();
				Class122.method2111(true);
			}

			if (state == GameState.UNK_18 || state == GameState.UNK_5) {
				Class60.method1172();
			}

			boolean prevState = state == GameState.UNK_1 || loggedOut(state) || inLobby(state);
			boolean currState = client.GAME_STATE == GameState.UNK_1 || loggedOut(client.GAME_STATE) || GameState.inLobby(client.GAME_STATE);
			if (prevState != currState) {
				if (prevState) {
					Class260.anInt3223 = Class260.anInt3228;
					if (Class393.preferences.aPreference_Sub13_8229.method12714() != 0) {
						Class339.method6047(IndexLoaders.MUSIC_INDEX, Class260.anInt3228, Class393.preferences.aPreference_Sub13_8229.method12714());
						GraphicsPreference.method12658();
					} else {
						Class358.method6240();
					}

					Class119.JS5_STANDARD_REQUESTER.method5523(false);
				} else {
					Class358.method6240();
					Class119.JS5_STANDARD_REQUESTER.method5523(true);
				}
			}

			if (method7742(state) || state == GameState.UNK_10 || state == GameState.UNK_17) {
				Renderers.CURRENT_RENDERER.method8420();
			}

			client.GAME_STATE = state;
		}

	}
}
