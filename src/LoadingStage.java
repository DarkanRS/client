public class LoadingStage {
	
	static LoadingStage aClass387_4697;
	static LoadingStage aClass387_4695;
	static LoadingStage aClass387_4696;
	static LoadingStage aClass387_4702;
	static LoadingStage aClass387_4708;
	static LoadingStage aClass387_4699;
	static LoadingStage aClass387_4700;
	static LoadingStage aClass387_4717;
	static LoadingStage aClass387_4709;
	static LoadingStage aClass387_4716;
	static LoadingStage aClass387_4704;
	static LoadingStage aClass387_4705;
	static LoadingStage aClass387_4706;
	static LoadingStage aClass387_4707;
	static LoadingStage aClass387_4713;
	static LoadingStage aClass387_4698;
	static LoadingStage aClass387_4710;
	static LoadingStage aClass387_4701;
	public int anInt4712;
	Message aClass433_4711;
	Message aClass433_4714;
	int anInt4715;
	int anInt4703;
	boolean aBool4694;
	boolean aBool4718;

	static {
		aClass387_4697 = new LoadingStage(0, Message.CHECKING_FOR_UPDATES, 2);
		aClass387_4695 = new LoadingStage(1, Message.CHECKING_FOR_UPDATES, Message.CHECKING_FOR_UPDATES, 2, 3);
		aClass387_4696 = new LoadingStage(2, Message.CHECKING_FOR_UPDATES, 3);
		aClass387_4702 = new LoadingStage(3, Message.CHECKING_FOR_UPDATES, Message.CHECKING_FOR_UPDATES, 3, 4);
		aClass387_4708 = new LoadingStage(4, Message.CHECKING_FOR_UPDATES, 4);
		aClass387_4699 = new LoadingStage(5, Message.CHECKING_FOR_UPDATES, Message.CHECKING_FOR_UPDATES, 4, 5);
		aClass387_4700 = new LoadingStage(6, Message.CHECKING_FOR_UPDATES, Message.CHECKING_FOR_UPDATES, 5, 98, true);
		aClass387_4717 = new LoadingStage(7, Message.CHECKING_FOR_UPDATES, 99);
		aClass387_4709 = new LoadingStage(8, Message.CHECKING_FOR_UPDATES, 100);
		aClass387_4716 = new LoadingStage(9, Message.FETCHING_UPDATES, Message.FETCHING_UPDATES, 0, 92, true);
		aClass387_4704 = new LoadingStage(10, Message.FETCHING_UPDATES, Message.FETCHING_UPDATES, 92, 93);
		aClass387_4705 = new LoadingStage(11, Message.FETCHING_UPDATES, Message.FETCHING_UPDATES, 94, 95);
		aClass387_4706 = new LoadingStage(12, Message.FETCHING_UPDATES, Message.FETCHING_UPDATES, 96, 97);
		aClass387_4707 = new LoadingStage(13, Message.FETCHING_UPDATES, 97);
		aClass387_4713 = new LoadingStage(14, Message.FETCHING_UPDATES, 97);
		aClass387_4698 = new LoadingStage(15, Message.FETCHING_UPDATES, 100);
		aClass387_4710 = new LoadingStage(16, Message.FETCHING_UPDATES, 100);
		aClass387_4701 = new LoadingStage(17, Message.FETCHING_UPDATES, 100);
	}

	LoadingStage(int i_1, Message message_2, Message message_3, int i_4, int i_5, boolean bool_7) {
		this.anInt4712 = i_1;
		this.aClass433_4711 = message_2;
		this.aClass433_4714 = message_3;
		this.anInt4715 = i_4;
		this.anInt4703 = i_5;
		this.aBool4694 = true;
		this.aBool4718 = bool_7;
	}

	LoadingStage(int i_1, Message message_2, int i_3) {
		this(i_1, message_2, message_2, i_3, i_3, false);
	}

	LoadingStage(int i_1, Message message_2, Message message_3, int i_4, int i_5) {
		this(i_1, message_2, message_3, i_4, i_5, false);
	}

	static LoadingStage[] method6676() {
		return new LoadingStage[] { aClass387_4697, aClass387_4695, aClass387_4696, aClass387_4702, aClass387_4708, aClass387_4699, aClass387_4700, aClass387_4717, aClass387_4709, aClass387_4716, aClass387_4704, aClass387_4705, aClass387_4706, aClass387_4707, aClass387_4713, aClass387_4698, aClass387_4710, aClass387_4701 };
	}

	static final void renderMiniMiniMap(GraphicalRenderer graphicalrenderer_0, int i_1, int i_2, int i_3, int i_4) {
		graphicalrenderer_0.r(i_1, i_2, i_3 + i_1, i_2 + i_4);
		graphicalrenderer_0.method8425(i_1, i_2, i_3, i_4, -16777216, (byte) -58);
		if (Class291_Sub1.anInt8015 >= 100) {
			float f_6 = (float) Class291_Sub1.yLength / (float) Class291_Sub1.xLength;
			int i_7 = i_3;
			int i_8 = i_4;
			if (f_6 < 1.0F) {
				i_8 = (int) (f_6 * (float) i_3);
			} else {
				i_7 = (int) ((float) i_4 / f_6);
			}
			i_1 += (i_3 - i_7) / 2;
			i_2 += (i_4 - i_8) / 2;
			if (Defaults7Loader.aNativeSprite_5883 == null || Defaults7Loader.aNativeSprite_5883.method2747() != i_3 || Defaults7Loader.aNativeSprite_5883.method2793() != i_4) {
				Class291_Sub1.method5139(Class291_Sub1.anInt3472, Class291_Sub1.anInt3473 + Class291_Sub1.yLength, Class291_Sub1.xLength + Class291_Sub1.anInt3472, Class291_Sub1.anInt3473, i_1, i_2, i_7 + i_1, i_8 + i_2);
				Class291_Sub1.renderMap(graphicalrenderer_0);
				Defaults7Loader.aNativeSprite_5883 = graphicalrenderer_0.method8668(i_1, i_2, i_7, i_8, false);
			}
			Defaults7Loader.aNativeSprite_5883.method2752(i_1, i_2);
			int i_9 = i_7 * Class488.anInt5760 / Class291_Sub1.xLength;
			int i_10 = i_8 * Class351.anInt4097 / Class291_Sub1.yLength;
			int i_11 = i_7 * MapRegionLoaderTask.anInt3991 / Class291_Sub1.xLength + i_1;
			int i_12 = i_8 + i_2 - i_8 * VarnBitDefinitions.anInt5765 / Class291_Sub1.yLength - i_10;
			int i_13 = -1996554240;
			if (Game.stellarDawn == client.CURRENT_GAME) {
				i_13 = -1996488705;
			}
			graphicalrenderer_0.B(i_11, i_12, i_9, i_10, i_13, 1);
			graphicalrenderer_0.method8430(i_11, i_12, i_9, i_10, i_13, 0);
			if (Class361.anInt4185 > 0) {
				int i_14;
				if (CutsceneAction_Sub9.anInt9282 > 50) {
					i_14 = 500 - CutsceneAction_Sub9.anInt9282 * 5;
				} else {
					i_14 = CutsceneAction_Sub9.anInt9282 * 5;
				}
				for (Node_Sub36 class282_sub36_15 = (Node_Sub36) Class291_Sub1.aClass482_3459.head(); class282_sub36_15 != null; class282_sub36_15 = (Node_Sub36) Class291_Sub1.aClass482_3459.next(-387502259)) {
					MapAreaDefinitions worldmapareadefs_16 = Class291_Sub1.MAP_AREA_LOADER.getWorldMapDefs(class282_sub36_15.anInt7991, 1043671083);
					if (Node_Sub16.method12248(worldmapareadefs_16, -2066566460)) {
						int i_17;
						int i_18;
						if (class282_sub36_15.anInt7991 == Class291_Sub1.anInt8018) {
							i_17 = i_7 * class282_sub36_15.anInt7987 / Class291_Sub1.xLength + i_1;
							i_18 = i_8 * (Class291_Sub1.yLength - class282_sub36_15.anInt7993) / Class291_Sub1.yLength + i_2;
							graphicalrenderer_0.method8425(i_17 - 2, i_18 - 2, 4, 4, i_14 << 24 | 0xffff00, (byte) -94);
						} else if (Class291_Sub1.anInt8026 != -1 && worldmapareadefs_16.anInt2718 == Class291_Sub1.anInt8026) {
							i_17 = i_7 * class282_sub36_15.anInt7987 / Class291_Sub1.xLength + i_1;
							i_18 = i_8 * (Class291_Sub1.yLength - class282_sub36_15.anInt7993) / Class291_Sub1.yLength + i_2;
							graphicalrenderer_0.method8425(i_17 - 2, i_18 - 2, 4, 4, i_14 << 24 | 0xffff00, (byte) -94);
						}
					}
				}
			}
		}
	}

	static final void method6683(int i_0, int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7) {
		int i_8 = i_6 - 334;
		if (i_8 < 0) {
			i_8 = 0;
		} else if (i_8 > 100) {
			i_8 = 100;
		}
		int i_9 = (client.aShort7324 - client.aShort7394) * i_8 / 100 + client.aShort7394;
		i_5 = i_5 * i_9 >> 8;
		int i_10 = 16384 - i_3 & 0x3fff;
		int i_11 = 16384 - i_4 & 0x3fff;
		int i_12 = 0;
		int i_13 = 0;
		int i_14 = i_5;
		if (i_10 != 0) {
			i_13 = Class382.SINE[i_10] * -i_5 >> 14;
			i_14 = Class382.COSINE[i_10] * i_5 >> 14;
		}
		if (i_11 != 0) {
			i_12 = Class382.SINE[i_11] * i_14 >> 14;
			i_14 = Class382.COSINE[i_11] * i_14 >> 14;
		}
		IdentitiKitIndexLoader.CAM_MOVE_ABSOLUTEX = i_0 - i_12;
		Class109_Sub1.CAM_MOVE_TERRAIN_HEIGHT = i_1 - i_13;
		Class246.CAM_MOVE_ABSOLUTEY = i_2 - i_14;
		Class293.anInt3512 = i_3;
		AnimationDefinitions.anInt5930 = i_4;
		Class121.anInt1525 = 0;
	}

	public static boolean method6684(int cutsceneId) {
		if (cutsceneId != Class86.anInt831 || ReflectionCheck.aClass85_8039 == null) {
			Class79.method1390(769951591);
			ReflectionCheck.aClass85_8039 = Class85.aClass85_815;
			Class86.anInt831 = cutsceneId;
		}
		if (ReflectionCheck.aClass85_8039 == Class85.aClass85_815) {
			byte[] data = IndexLoaders.CUTSCENE_INDEX.getFile(cutsceneId);
			if (data == null) {
				return false;
			}
			RsByteBuffer buffer = new RsByteBuffer(data);
			Class176.method2976(buffer);
			int areas = buffer.readUnsignedByte();
			for (int i = 0; i < areas; i++) {
				Class86.CUTSCENE_AREAS.append(new CutsceneArea(buffer));
			}
			int i_5 = buffer.readUnsignedSmart();
			Class86.aClass77Array818 = new Class77[i_5];
			for (int i_6 = 0; i_6 < i_5; i_6++) {
				Class86.aClass77Array818[i_6] = new Class77(buffer);
			}
			int i_6 = buffer.readUnsignedSmart();
			Class82.aClass75Array804 = new CutsceneEntity[i_6];
			int i_14;
			for (i_14 = 0; i_14 < i_6; i_14++) {
				Class82.aClass75Array804[i_14] = new CutsceneEntity(buffer, i_14);
			}
			i_14 = buffer.readUnsignedSmart();
			Class86.aClass92Array820 = new Class92[i_14];
			int i_8;
			for (i_8 = 0; i_8 < i_14; i_8++) {
				Class86.aClass92Array820[i_8] = new Class92(buffer);
			}
			i_8 = buffer.readUnsignedSmart();
			Class86.aClass93Array821 = new Class93[i_8];
			int i_9;
			for (i_9 = 0; i_9 < i_8; i_9++) {
				Class86.aClass93Array821[i_9] = new Class93(buffer);
			}
			i_9 = buffer.readUnsignedSmart();
			Class86.aCutsceneActionArray822 = new CutsceneAction[i_9];
			for (int i_10 = 0; i_10 < i_9; i_10++) {
				Class86.aCutsceneActionArray822[i_10] = Class16.method562(buffer);
			}
			ReflectionCheck.aClass85_8039 = Class85.aClass85_816;
		}
		if (Class85.aClass85_816 == ReflectionCheck.aClass85_8039) {
			boolean bool_11 = true;
			CutsceneEntity[] arr_16 = Class82.aClass75Array804;
			for (int i_4 = 0; i_4 < arr_16.length; i_4++) {
				CutsceneEntity class75_13 = arr_16[i_4];
				if (!class75_13.ready()) {
					bool_11 = false;
				}
			}
			CutsceneAction[] arr_12 = Class86.aCutsceneActionArray822;
			for (int i_5 = 0; i_5 < arr_12.length; i_5++) {
				CutsceneAction class96_15 = arr_12[i_5];
				if (!class96_15.method1599()) {
					bool_11 = false;
				}
			}
			Class92[] arr_17 = Class86.aClass92Array820;
			for (int i_6 = 0; i_6 < arr_17.length; i_6++) {
				Class92 class92_7 = arr_17[i_6];
				if (!class92_7.method1557()) {
					bool_11 = false;
				}
			}
			if (!bool_11) {
				return false;
			}
			ReflectionCheck.aClass85_8039 = Class85.aClass85_814;
		}
		return true;
	}

	static void method6686(GraphicalRenderer graphicalrenderer_0, byte[][][] bytes_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9, int i_10, int i_11) {
		if (i_9 != 0 && i_2 != 0) {
			if (i_9 == 9) {
				i_9 = 1;
				i_10 = i_10 + 1 & 0x3;
			}
			if (i_9 == 10) {
				i_9 = 1;
				i_10 = i_10 + 3 & 0x3;
			}
			if (i_9 == 11) {
				i_9 = 8;
				i_10 = i_10 + 3 & 0x3;
			}
			graphicalrenderer_0.N(i_3, i_4, i_7, i_8, i_5, i_6, bytes_1[i_9 - 1][i_10], i_2, i_11);
		}
	}
}
