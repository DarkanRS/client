package com.jagex;

public class Class42 implements Interface2 {

	public static long method891(int i_3, int i_4, int i_5) {
		Class407.aCalendar4846.clear();
		Class407.aCalendar4846.set(i_5, i_4, i_3, 12, 0, 0);
		return Class407.aCalendar4846.getTime().getTime();
	}

	public static void playSoundSong(int i_0, int volume, int i_2) {
		if (Class260.aClass116_3229 != null && Class260.aClass116_3229.isLoaded() && i_0 == Class260.aClass116_3229.musicId) {
			Class256.method4412(Class260.aClass116_3229, volume);
			Class260.anInt3223 = i_0;
			Class260.aClass116_3229 = null;
			Class260.aNode_Sub15_Sub2_3231 = null;
			TCPPacket tcpmessage_4 = TCPPacket.createPacket(ClientProt.SONG_LOADED, client.GAME_CONNECTION_CONTEXT.outKeys);
			tcpmessage_4.buffer.writeInt(-1);
			client.GAME_CONNECTION_CONTEXT.queuePacket(tcpmessage_4);
		} else {
			volume = volume * Class393.preferences.musicVolume.method12714() >> 8;
			if (i_0 == -1 && !Class260.aBool3220)
				VarBitDefinitions.method3805();
			else if (i_0 != -1 && (i_0 != Class260.anInt3223 || !SongReference.method1966()) && volume != 0 && !Class260.aBool3220) {
				Node_Sub1.method11615(i_2, IndexLoaders.MUSIC_INDEX, i_0, volume, new Class109_Sub1());
				GraphicsPreference.method12658();
			}
			if (i_0 != Class260.anInt3223)
				Class260.aNode_Sub15_Sub2_3231 = null;
			Class260.anInt3223 = i_0;
			Class260.aClass277_3234 = null;
		}
	}

	NativeSprite aNativeSprite_414;

	Index aClass317_415;

	Class357 aClass357_416;

	Class42(Index index_1, Class357 class357_2) {
		aClass317_415 = index_1;
		aClass357_416 = class357_2;
	}

	@Override
	public boolean method10() {
		return aClass317_415.loadFile(aClass357_416.anInt4124);
	}

	@Override
	public void method11(boolean bool_1) {
		if (bool_1) {
			int i_2 = aClass357_416.aClass356_4121.method6221(aNativeSprite_414.scaleWidth(), client.GAME_WIDTH * 1426041429 * 765 * -1115795005 * 150480619) + aClass357_416.anInt4123 * 1535819339 * -809264285;
			int i_3 = aClass357_416.aClass353_4122.method6198(aNativeSprite_414.method2748(), 1176039023 * client.GAME_HEIGHT * -994133479 * 553 * -645779313) + 177795463 * aClass357_416.anInt4120 * -818805705;
			aNativeSprite_414.method2752(i_2, i_3);
		}
	}

	@Override
	public void method12(boolean bool_1) {
		if (bool_1) {
			int i_2 = aClass357_416.aClass356_4121.method6221(aNativeSprite_414.scaleWidth(), client.GAME_WIDTH * 1426041429 * 765 * -1115795005 * 150480619) + aClass357_416.anInt4123 * 1535819339 * -809264285;
			int i_3 = aClass357_416.aClass353_4122.method6198(aNativeSprite_414.method2748(), 1176039023 * client.GAME_HEIGHT * -994133479 * 553 * -645779313) + 177795463 * aClass357_416.anInt4120 * -818805705;
			aNativeSprite_414.method2752(i_2, i_3);
		}
	}

	@Override
	public boolean method13() {
		return aClass317_415.loadFile(aClass357_416.anInt4124 * -206423037 * -1847374165);
	}

	@Override
	public void method14(boolean bool_1) {
		if (bool_1) {
			int i_2 = aClass357_416.aClass356_4121.method6221(aNativeSprite_414.scaleWidth(), client.GAME_WIDTH * 1426041429 * 765 * -1115795005 * 150480619) + aClass357_416.anInt4123 * 1535819339 * -809264285;
			int i_3 = aClass357_416.aClass353_4122.method6198(aNativeSprite_414.method2748(), 1176039023 * client.GAME_HEIGHT * -994133479 * 553 * -645779313) + 177795463 * aClass357_416.anInt4120 * -818805705;
			aNativeSprite_414.method2752(i_2, i_3);
		}
	}

	@Override
	public void method15() {
		aNativeSprite_414 = Class152.method2600(aClass317_415, -1847374165 * aClass357_416.anInt4124 * -206423037);
	}

	@Override
	public void method16() {
		aNativeSprite_414 = Class152.method2600(aClass317_415, -1847374165 * aClass357_416.anInt4124 * -206423037);
	}

	@Override
	public boolean method17() {
		return aClass317_415.loadFile(aClass357_416.anInt4124 * -206423037 * -1847374165);
	}

	@Override
	public void method18() {
		aNativeSprite_414 = Class152.method2600(aClass317_415, -1847374165 * aClass357_416.anInt4124 * -206423037);
	}

	@Override
	public void method19() {
		aNativeSprite_414 = Class152.method2600(aClass317_415, -1847374165 * aClass357_416.anInt4124 * -206423037);
	}

	@Override
	public void method20(boolean bool_1) {
		if (bool_1) {
			int i_3 = aClass357_416.aClass356_4121.method6221(aNativeSprite_414.scaleWidth(), client.GAME_WIDTH) + aClass357_416.anInt4123;
			int i_4 = aClass357_416.aClass353_4122.method6198(aNativeSprite_414.method2748(), client.GAME_HEIGHT) + aClass357_416.anInt4120;
			aNativeSprite_414.method2752(i_3, i_4);
		}
	}

	@Override
	public boolean method21() {
		return aClass317_415.loadFile(aClass357_416.anInt4124 * -206423037 * -1847374165);
	}

	@Override
	public void method22() {
		aNativeSprite_414 = Class152.method2600(aClass317_415, aClass357_416.anInt4124);
	}

	@Override
	public void method23() {
		aNativeSprite_414 = Class152.method2600(aClass317_415, -1847374165 * aClass357_416.anInt4124 * -206423037);
	}

	@Override
	public boolean method9() {
		return aClass317_415.loadFile(aClass357_416.anInt4124 * -206423037 * -1847374165);
	}
}
