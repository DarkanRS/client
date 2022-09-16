package com.jagex;

public class Class42_Sub1 extends Class42 {

	static void method14562() {
		FontMetrics.method6989();
		IndexLoaders.MAP_REGION_DECODER.method4485();

		int i_1;
		for (i_1 = 0; i_1 < client.HINT_ARROWS.length; i_1++)
			client.HINT_ARROWS[i_1] = null;

		for (i_1 = 0; i_1 < client.HINT_TRAILS.length; i_1++)
			client.HINT_TRAILS[i_1] = null;

		Class186.method3084();

		for (i_1 = 0; i_1 < 2048; i_1++)
			client.players[i_1] = null;

		client.NPC_UPDATE_INDEX = 0;
		client.NPC_MAP.method7749();
		client.anInt7210 = 0;
		client.aClass465_7414.method7749();
		Class514.method8841();
		client.anInt7221 = 0;
		Class158_Sub1.PLAYER_VAR_PROVIDER.method265();
		Node_Sub13.GUEST_CLAN_SETTINGS = null;
		QuickchatFiller.CLAN_SETTINGS = null;
		AsyncConnection.LISTENED_CLAN_CHANNEL = null;
		Class113.CLAN_CHANNEL = null;
		PingRequest.CURRENT_REQUEST = null;
		Class28.aLong351 = 0L;
		Class316.method5594();
		HitsplatDefinitions.method3851();
	}

	static void method14563(Node_Sub15_Sub2 class282_sub15_sub2_1) {
		Class320.aClass253_3723.method4329(class282_sub15_sub2_1);
		Static.method2084(IndexLoaders.SOUND_MIDI_INDEX, IndexLoaders.MIDI_INSTRUMENT_INDEX, IndexLoaders.SOUND_EFFECT_INDEX, class282_sub15_sub2_1, Class320.aClass253_3723);
	}

	int anInt9232;

	Class42_Sub1(Index index_1, Class357_Sub1 class357_sub1_2) {
		super(index_1, class357_sub1_2);
	}

	@Override
	public void method11(boolean bool_1) {
		int i_2 = aClass357_416.aClass356_4121.method6221(aNativeSprite_414.scaleWidth(), 150480619 * client.GAME_WIDTH * 1426041429 * 765 * -1115795005) + aClass357_416.anInt4123 * 1535819339 * -809264285;
		int i_3 = aClass357_416.aClass353_4122.method6198(aNativeSprite_414.method2748(), 1176039023 * client.GAME_HEIGHT * -994133479 * 553 * -645779313) + aClass357_416.anInt4120 * -818805705 * 177795463;
		aNativeSprite_414.method2758((i_2 + aNativeSprite_414.scaleWidth() / 2), (i_3 + aNativeSprite_414.method2748() / 2), 4096, anInt9232 * -82188333 * 734267483);
		anInt9232 = (anInt9232 * -82188333 + -1519742369 * ((Class357_Sub1) aClass357_416).anInt7808 * 1780229901) * 734267483;
	}

	@Override
	public void method12(boolean bool_1) {
		int i_2 = aClass357_416.aClass356_4121.method6221(aNativeSprite_414.scaleWidth(), 150480619 * client.GAME_WIDTH * 1426041429 * 765 * -1115795005) + aClass357_416.anInt4123 * 1535819339 * -809264285;
		int i_3 = aClass357_416.aClass353_4122.method6198(aNativeSprite_414.method2748(), 1176039023 * client.GAME_HEIGHT * -994133479 * 553 * -645779313) + aClass357_416.anInt4120 * -818805705 * 177795463;
		aNativeSprite_414.method2758((i_2 + aNativeSprite_414.scaleWidth() / 2), (i_3 + aNativeSprite_414.method2748() / 2), 4096, anInt9232 * -82188333 * 734267483);
		anInt9232 = (anInt9232 * -82188333 + -1519742369 * ((Class357_Sub1) aClass357_416).anInt7808 * 1780229901) * 734267483;
	}

	@Override
	public void method14(boolean bool_1) {
		int i_2 = aClass357_416.aClass356_4121.method6221(aNativeSprite_414.scaleWidth(), 150480619 * client.GAME_WIDTH * 1426041429 * 765 * -1115795005) + aClass357_416.anInt4123 * 1535819339 * -809264285;
		int i_3 = aClass357_416.aClass353_4122.method6198(aNativeSprite_414.method2748(), 1176039023 * client.GAME_HEIGHT * -994133479 * 553 * -645779313) + aClass357_416.anInt4120 * -818805705 * 177795463;
		aNativeSprite_414.method2758((i_2 + aNativeSprite_414.scaleWidth() / 2), (i_3 + aNativeSprite_414.method2748() / 2), 4096, anInt9232 * -82188333 * 734267483);
		anInt9232 = (anInt9232 * -82188333 + -1519742369 * ((Class357_Sub1) aClass357_416).anInt7808 * 1780229901) * 734267483;
	}

	@Override
	public void method20(boolean bool_1) {
		int i_3 = aClass357_416.aClass356_4121.method6221(aNativeSprite_414.scaleWidth(), client.GAME_WIDTH) + aClass357_416.anInt4123;
		int i_4 = aClass357_416.aClass353_4122.method6198(aNativeSprite_414.method2748(), client.GAME_HEIGHT) + aClass357_416.anInt4120;
		aNativeSprite_414.method2758((i_3 + aNativeSprite_414.scaleWidth() / 2), (i_4 + aNativeSprite_414.method2748() / 2), 4096, anInt9232);
		anInt9232 += ((Class357_Sub1) aClass357_416).anInt7808;
	}

}
