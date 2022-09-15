package com.jagex;

public class Class16 {

	public static FontMetrics aClass414_139;
	public static FontRenderer aFontRenderer_144;
	static int anInt135;
	public static int p12FullIndex;
	static int anInt137;
	static NativeSprite[] aNativeSpriteArray138;
	public static int p11FullIndex;
	static int anInt141;
	static int anInt142;
	static int anInt143;
	static NativeSprite[] aNativeSpriteArray145;
	static NativeSprite aNativeSprite_146;

	public static void addIgnore(String string_0, boolean bool_1) {
		if (string_0 != null)
			if (client.IGNORE_LIST_COUNT >= 100)
				ChatLine.appendGameMessage(LocalizedText.aClass433_5289.translate(Class223.CURRENT_LANGUAGE));
			else {
				String string_3 = Class383.method6515(string_0);
				if (string_3 != null) {
					int i_4;
					String string_6;
					String string_7;
					for (i_4 = 0; i_4 < client.IGNORE_LIST_COUNT; i_4++) {
						IgnoredPlayer class10_5 = client.IGNORED_PLAYERS[i_4];
						string_6 = Class383.method6515(class10_5.displayName);
						if (string_6 != null && string_6.equals(string_3)) {
							ChatLine.appendGameMessage(string_0 + LocalizedText.aClass433_5302.translate(Class223.CURRENT_LANGUAGE));
							return;
						}
						if (class10_5.lastDisplayName != null) {
							string_7 = Class383.method6515(class10_5.lastDisplayName);
							if (string_7 != null && string_7.equals(string_3)) {
								ChatLine.appendGameMessage(string_0 + LocalizedText.aClass433_5302.translate(Class223.CURRENT_LANGUAGE));
								return;
							}
						}
					}
					for (i_4 = 0; i_4 < client.FRIEND_COUNT; i_4++) {
						Friend class6_9 = client.FRIENDS[i_4];
						string_6 = Class383.method6515(class6_9.displayName);
						if (string_6 != null && string_6.equals(string_3)) {
							ChatLine.appendGameMessage(LocalizedText.aClass433_5308.translate(Class223.CURRENT_LANGUAGE) + string_0 + LocalizedText.aClass433_5192.translate(Class223.CURRENT_LANGUAGE));
							return;
						}
						if (class6_9.username != null) {
							string_7 = Class383.method6515(class6_9.username);
							if (string_7 != null && string_7.equals(string_3)) {
								ChatLine.appendGameMessage(LocalizedText.aClass433_5308.translate(Class223.CURRENT_LANGUAGE) + string_0 + LocalizedText.aClass433_5192.translate(Class223.CURRENT_LANGUAGE));
								return;
							}
						}
					}
					if (Class383.method6515(VertexNormal.MY_PLAYER.displayName).equals(string_3))
						ChatLine.appendGameMessage(LocalizedText.aClass433_5238.translate(Class223.CURRENT_LANGUAGE));
					else {
						BufferedConnectionContext class184_8 = BufferedConnectionContext.getConnectionContext();
						TCPPacket tcpmessage_10 = TCPPacket.createPacket(ClientProt.ADD_IGNORE, class184_8.outKeys);
						tcpmessage_10.buffer.writeByte(ChatLine.getLength(string_0) + 1);
						tcpmessage_10.buffer.writeString(string_0);
						tcpmessage_10.buffer.writeByte(bool_1 ? 1 : 0);
						class184_8.queuePacket(tcpmessage_10);
					}
				}
			}
	}

	public static void method566() {
		Class260.SOUNDS = new AreadSound[50];
		Class260.SOUNDS_SIZE = 0;
	}

	static void method568(int i_0, int i_1, int i_2, int i_3) {
		if (i_0 > i_1)
			KeyHoldInputSubscriber.method3922(Class532.anIntArrayArray7072[i_2], i_1, i_0, i_3);
		else
			KeyHoldInputSubscriber.method3922(Class532.anIntArrayArray7072[i_2], i_0, i_1, i_3);
	}

	Class16() throws Throwable {
		throw new Error();
	}
}
