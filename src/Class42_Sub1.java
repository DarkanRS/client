public class Class42_Sub1 extends Class42 {

	int anInt9232 = 0;

	public void method12(boolean bool_1) {
		int i_2 = this.aClass357_416.aClass356_4121.method6221(this.aNativeSprite_414.scaleWidth(), 150480619 * client.GAME_WIDTH * 1426041429 * 765 * -1115795005, 1532503387) + this.aClass357_416.anInt4123 * 1535819339 * -809264285;
		int i_3 = this.aClass357_416.aClass353_4122.method6198(this.aNativeSprite_414.method2748(), 1176039023 * client.GAME_HEIGHT * -994133479 * 553 * -645779313, 723681584) + this.aClass357_416.anInt4120 * -818805705 * 177795463;
		this.aNativeSprite_414.method2758((float) (i_2 + this.aNativeSprite_414.scaleWidth() / 2), (float) (i_3 + this.aNativeSprite_414.method2748() / 2), 4096, this.anInt9232 * -82188333 * 734267483);
		this.anInt9232 = (this.anInt9232 * -82188333 + -1519742369 * ((Class357_Sub1) this.aClass357_416).anInt7808 * 1780229901) * 734267483;
	}

	public void method20(boolean bool_1, int i_2) {
		int i_3 = this.aClass357_416.aClass356_4121.method6221(this.aNativeSprite_414.scaleWidth(), client.GAME_WIDTH, 1375122589) + this.aClass357_416.anInt4123;
		int i_4 = this.aClass357_416.aClass353_4122.method6198(this.aNativeSprite_414.method2748(), client.GAME_HEIGHT, 1542020765) + this.aClass357_416.anInt4120;
		this.aNativeSprite_414.method2758((float) (i_3 + this.aNativeSprite_414.scaleWidth() / 2), (float) (i_4 + this.aNativeSprite_414.method2748() / 2), 4096, this.anInt9232);
		this.anInt9232 += ((Class357_Sub1) this.aClass357_416).anInt7808;
	}

	Class42_Sub1(Index index_1, Class357_Sub1 class357_sub1_2) {
		super(index_1, class357_sub1_2);
	}

	public void method11(boolean bool_1) {
		int i_2 = this.aClass357_416.aClass356_4121.method6221(this.aNativeSprite_414.scaleWidth(), 150480619 * client.GAME_WIDTH * 1426041429 * 765 * -1115795005, 998209587) + this.aClass357_416.anInt4123 * 1535819339 * -809264285;
		int i_3 = this.aClass357_416.aClass353_4122.method6198(this.aNativeSprite_414.method2748(), 1176039023 * client.GAME_HEIGHT * -994133479 * 553 * -645779313, 1415783080) + this.aClass357_416.anInt4120 * -818805705 * 177795463;
		this.aNativeSprite_414.method2758((float) (i_2 + this.aNativeSprite_414.scaleWidth() / 2), (float) (i_3 + this.aNativeSprite_414.method2748() / 2), 4096, this.anInt9232 * -82188333 * 734267483);
		this.anInt9232 = (this.anInt9232 * -82188333 + -1519742369 * ((Class357_Sub1) this.aClass357_416).anInt7808 * 1780229901) * 734267483;
	}

	public void method14(boolean bool_1) {
		int i_2 = this.aClass357_416.aClass356_4121.method6221(this.aNativeSprite_414.scaleWidth(), 150480619 * client.GAME_WIDTH * 1426041429 * 765 * -1115795005, 2141573560) + this.aClass357_416.anInt4123 * 1535819339 * -809264285;
		int i_3 = this.aClass357_416.aClass353_4122.method6198(this.aNativeSprite_414.method2748(), 1176039023 * client.GAME_HEIGHT * -994133479 * 553 * -645779313, 1379612948) + this.aClass357_416.anInt4120 * -818805705 * 177795463;
		this.aNativeSprite_414.method2758((float) (i_2 + this.aNativeSprite_414.scaleWidth() / 2), (float) (i_3 + this.aNativeSprite_414.method2748() / 2), 4096, this.anInt9232 * -82188333 * 734267483);
		this.anInt9232 = (this.anInt9232 * -82188333 + -1519742369 * ((Class357_Sub1) this.aClass357_416).anInt7808 * 1780229901) * 734267483;
	}

	static final void method14562(int i_0) {
		FontMetrics.method6989();
		IndexLoaders.MAP_REGION_DECODER.method4485(-617728645);

		int i_1;
		for (i_1 = 0; i_1 < client.aClass180Array7348.length; i_1++) {
			client.aClass180Array7348[i_1] = null;
		}

		for (i_1 = 0; i_1 < client.aClass281Array7180.length; i_1++) {
			client.aClass281Array7180[i_1] = null;
		}

		Class186.method3084();

		for (i_1 = 0; i_1 < 2048; i_1++) {
			client.players[i_1] = null;
		}

		client.NPC_UPDATE_INDEX = 0;
		client.NPCS.method7749(299866501);
		client.anInt7210 = 0;
		client.aClass465_7414.method7749(-156011970);
		Class514.method8841(912280086);
		client.anInt7221 = 0;
		Class158_Sub1.PLAYER_VAR_PROVIDER.method265(161279493);
		Node_Sub13.GUEST_CLAN_SETTINGS = null;
		QuickchatFiller.CLAN_SETTINGS = null;
		AsyncConnection.GUEST_CLAN_CHANNEL = null;
		Class113.CLAN_CHANNEL = null;
		PingRequest.CURRENT_REQUEST = null;
		Class28.aLong351 = 0L;
		Class316.method5594();
		HitsplatDefinitions.method3851();
	}

	static void method14563(Node_Sub15_Sub2 class282_sub15_sub2_1, short s_2) {
		Class320.aClass253_3723.method4329(class282_sub15_sub2_1);
		Static.method2084(IndexLoaders.SOUND_MIDI_INDEX, IndexLoaders.MIDI_INSTRUMENT_INDEX, IndexLoaders.SOUND_EFFECT_INDEX, class282_sub15_sub2_1, Class320.aClass253_3723);
	}

}
