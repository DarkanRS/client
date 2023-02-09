package com.rs.jagex;

public class Class361 {

	public static Class361 aClass361_4174 = new Class361(9);
	public static Class361 aClass361_4170 = new Class361(3);
	public static Class361 aClass361_4171 = new Class361(7);
	public static Class361 aClass361_4182 = new Class361(8);
	public static Class361 aClass361_4173 = new Class361(10);
	public static Class361 aClass361_4178 = new Class361(4);
	public static Class361 aClass361_4175 = new Class361(15);
	public static Class361 aClass361_4177 = new Class361(1);
	public static Class361 aClass361_4169 = new Class361(5);
	public static Class361 aClass361_4176 = new Class361(11);
	public static Class361 aClass361_4179 = new Class361(13);
	public static Class361 aClass361_4180 = new Class361(6);
	public static Class361 aClass361_4181 = new Class361(2);
	public static Class361 aClass361_4172 = new Class361(12);
	public static Class361 aClass361_4183 = new Class361(14);
	static int anInt4185;
	public static byte[] getWhirlpool(byte[] bytes_0, int i_1, int i_2) {
		byte[] bytes_3;
		if (i_1 > 0) {
			bytes_3 = new byte[i_2];
			if (i_2 >= 0) System.arraycopy(bytes_0, i_1, bytes_3, 0, i_2);
		} else
			bytes_3 = bytes_0;
		Whirlpool whirlpool_6 = new Whirlpool();
		whirlpool_6.method7406();
		whirlpool_6.method7407(bytes_3, i_2 * 8);
		byte[] bytes_5 = new byte[64];
		whirlpool_6.method7408(bytes_5);
		return bytes_5;
	}

	static void method6269(MenuActionEvent class282_sub50_sub7_0) {
		if (class282_sub50_sub7_0 != null) {
			Class20.aClass482_171.append(class282_sub50_sub7_0);
			++Class20.anInt169;
			Object obj_2 = null;
			CacheableNode_Sub15 class282_sub50_sub15_3;
			if (!class282_sub50_sub7_0.aBool9586 && class282_sub50_sub7_0.aString9588 != null && !class282_sub50_sub7_0.aString9588.isEmpty()) {
				long long_4 = class282_sub50_sub7_0.aLong9580;
				for (class282_sub50_sub15_3 = (CacheableNode_Sub15) Class20.aClass465_172.get(long_4); class282_sub50_sub15_3 != null && !class282_sub50_sub15_3.aString9771.equals(class282_sub50_sub7_0.aString9588); class282_sub50_sub15_3 = (CacheableNode_Sub15) Class20.aClass465_172.method7747()) {
				}
				if (class282_sub50_sub15_3 == null) {
					class282_sub50_sub15_3 = (CacheableNode_Sub15) Class20.aClass229_164.get(long_4);
					if (class282_sub50_sub15_3 != null && !class282_sub50_sub15_3.aString9771.equals(class282_sub50_sub7_0.aString9588))
						class282_sub50_sub15_3 = null;
					if (class282_sub50_sub15_3 == null)
						class282_sub50_sub15_3 = new CacheableNode_Sub15(class282_sub50_sub7_0.aString9588);
					Class20.aClass465_172.put(class282_sub50_sub15_3, long_4);
					++Class20.anInt170;
				}
			} else {
				class282_sub50_sub15_3 = new CacheableNode_Sub15(class282_sub50_sub7_0.aString9588);
				++Class20.anInt170;
			}
			if (class282_sub50_sub15_3.method15245(class282_sub50_sub7_0))
				Class13.method503(class282_sub50_sub15_3);
		}
	}

	static void method6270() {
		if (GameState.method4180(client.GAME_STATE)) {
			if (client.LOBBY_CONNECTION_CONTEXT.getConnection() == null)
				GameState.setGameState(GameState.UNK_14);
			else
				GameState.setGameState(GameState.UNK_0);
		} else if (client.GAME_STATE != GameState.UNK_14 && client.GAME_STATE != GameState.UNK_19) {
			if (client.GAME_STATE == GameState.UNK_12)
				GameState.setGameState(GameState.UNK_5);
		} else
			GameState.setGameState(GameState.UNK_5);
	}

	static void method6274(GraphNode_Sub1 class521_sub1_0, int i_1) {
		FontRenderer_Sub3.method14336(class521_sub1_0, i_1, false);
	}

	int anInt4184;

	Class361(int i_1) {
		anInt4184 = i_1;
	}

	public String method6253() {
		return "_" + anInt4184;
	}

	public Object method6254(Object[] arr_1) throws Throwable {
		//return Class441.method7375(SubInterface.suppliedApplet, method6253(), arr_1);
		return new Object();
	}

	public Object method6255() throws Throwable {
		//return Class441.method7377(SubInterface.suppliedApplet, method6253());
		return new Object();
	}

	public void method6256(Object[] arr_1) {
		//        try {
			//            method6254(arr_1);
			//        } catch (Throwable ignored) {
		//        }
	}

	public void method6257() {
		//        try {
		//            method6255();
		//        } catch (Throwable ignored) {
		//        }
	}
}
