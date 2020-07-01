package com.jagex;

public class GameState {

	public static boolean loggedOut(int i_0) {
	    return i_0 == 5 || i_0 == 11 || i_0 == 14 || i_0 == 19 || i_0 == 3 || i_0 == 8 || i_0 == 9;
	}

	static boolean method7742(int i_0) {
	    return i_0 == 11 || i_0 == 2 || i_0 == 18 || i_0 == 6 || i_0 == 9;
	}

	public static boolean loggedIn(int i_0) {
	    return i_0 == 13 || i_0 == 18 || i_0 == 12;
	}

	public static void setGameState(int state) {
	    if (state != client.GAME_STATE) {
	        client.anInt7396 = 0;
	        if (state == 10 || state == 17) {
	            Class78.method1384();
	        }
	
	        if (state != 10 && ClanVarSettingsIndexLoader.aClass202_2883 != null) {
	            ClanVarSettingsIndexLoader.aClass202_2883.method3318();
	            ClanVarSettingsIndexLoader.aClass202_2883 = null;
	        }
	
	        if (state == 5) {
	            Class348.method6175(client.GAME_STATE == 3 || client.GAME_STATE == 8 || client.BASE_WINDOW_ID != QuickchatFiller.ENTITY_DEFAULTS.loginWindow);
	        }
	
	        if (state == 0) {
	            QuickChatMessage.method6161(client.BASE_WINDOW_ID != QuickchatFiller.ENTITY_DEFAULTS.lobbyWindow);
	        }
	
	        if (state != 14 && state != 12) {
	            if (state == 19 || state == 7 && client.GAME_STATE != 6) {
	                Class78.method1384();
	            } else if (state == 8) {
	                Class247.method4251();
	            }
	        } else {
	            QuickchatCategoryLoader.method5921();
	        }
	
	        if (method7742(state)) {
	            IndexLoaders.MAP_REGION_DECODER.method4445();
	            Class122.method2111(true);
	        }
	
	        if (state == 18 || state == 5) {
	            Class60.method1172();
	        }
	
	        boolean bool_2 = state == 1 || loggedOut(state) || GameState.inLobby(state);
	        boolean bool_3 = client.GAME_STATE == 1 || loggedOut(client.GAME_STATE) || GameState.inLobby(client.GAME_STATE);
	        if (bool_2 != bool_3) {
	            if (bool_2) {
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
	
	        if (method7742(state) || state == 10 || state == 17) {
	            Renderers.SOFTWARE_RENDERER.method8420();
	        }
	
	        client.GAME_STATE = state;
	    }
	
	}

	public static boolean inLobby(int i_0) {
	    return i_0 == 0 || i_0 == 2 || i_0 == 7 || i_0 == 6;
	}

}
