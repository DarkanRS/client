public class QuickchatCategoryLoader {

	SoftCache aClass229_3871 = new SoftCache(64);
	Index messagesIndex;
	Index menusIndex;

	public QuickChatCategoryDefinitions getChat(int id) {
		QuickChatCategoryDefinitions class282_sub50_sub14_3 = (QuickChatCategoryDefinitions) this.aClass229_3871.get((long) id);
		if (class282_sub50_sub14_3 != null) {
			return class282_sub50_sub14_3;
		} else {
			byte[] bytes_4;
			if (id >= 32768) {
				bytes_4 = this.menusIndex.getFile(0, id & 0x7fff);
			} else {
				bytes_4 = this.messagesIndex.getFile(0, id);
			}
			class282_sub50_sub14_3 = new QuickChatCategoryDefinitions();
			if (bytes_4 != null) {
				class282_sub50_sub14_3.method15209(new RsByteBuffer(bytes_4));
			}
			if (id >= 32768) {
				class282_sub50_sub14_3.method15213();
			}
			this.aClass229_3871.put(class282_sub50_sub14_3, (long) id);
			return class282_sub50_sub14_3;
		}
	}

	public QuickchatCategoryLoader(Language xlanguage_1, Index index_2, Index index_3) {
		this.messagesIndex = index_2;
		this.menusIndex = index_3;
		if (this.messagesIndex != null) {
			this.messagesIndex.filesCount(0);
		}
		if (this.menusIndex != null) {
			this.menusIndex.filesCount(0);
		}
	}

	static void method5921() {
		if (client.aByteArray7152 != null) {
			Class346.method6160();
		} else if (Class9.anInt76 != -1) {
			Class279.method4964();
		} else {
			Node_Sub20_Sub26.lobbyLogin(Class9.aString99, Class9.aString102);
		}
	}

	public static void method5923(Animable animable, int[] animationIds, int[] ints_2, int[] ints_3, int i_4) {
		for (int i_5 = 0; i_5 < animationIds.length; i_5++) {
			int i_6 = animationIds[i_5];
			int i_7 = ints_3[i_5];
			int i_8 = ints_2[i_5];
			for (int i_9 = 0; i_7 != 0 && i_9 < animable.aAnimation_Sub2_Sub1Array10354.length; i_7 >>>= 1) {
				if ((i_7 & 0x1) != 0) {
					if (i_6 == -1) {
						animable.aAnimation_Sub2_Sub1Array10354[i_9] = null;
					} else {
						AnimationDefinitions animationdefinitions_10 = IndexLoaders.ANIMATION_LOADER.getAnimDefs(i_6, (byte) 24);
						int i_11 = animationdefinitions_10.replayMode;
						Animation_Sub2_Sub1 class456_sub2_sub1_12 = animable.aAnimation_Sub2_Sub1Array10354[i_9];
						if (class456_sub2_sub1_12 != null && class456_sub2_sub1_12.hasDefs()) {
							if (i_6 == class456_sub2_sub1_12.method7597()) {
								if (i_11 == 0) {
									animable.aAnimation_Sub2_Sub1Array10354[i_9] = null;
									class456_sub2_sub1_12 = null;
								} else if (i_11 == 1) {
									class456_sub2_sub1_12.method7582((byte) -96);
									class456_sub2_sub1_12.anInt10065 = i_8;
								} else if (i_11 == 2) {
									class456_sub2_sub1_12.method7584(-309852534);
								}
							} else if (animationdefinitions_10.priority >= class456_sub2_sub1_12.getDefs().priority) {
								animable.aAnimation_Sub2_Sub1Array10354[i_9] = null;
								class456_sub2_sub1_12 = null;
							}
						}
						if (class456_sub2_sub1_12 == null || !class456_sub2_sub1_12.hasDefs()) {
							class456_sub2_sub1_12 = animable.aAnimation_Sub2_Sub1Array10354[i_9] = new Animation_Sub2_Sub1(animable);
							class456_sub2_sub1_12.update(i_6);
							class456_sub2_sub1_12.anInt10065 = i_8;
						}
					}
				}
				++i_9;
			}
		}
	}
}
