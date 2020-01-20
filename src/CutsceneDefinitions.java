
public class CutsceneDefinitions {

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
			readValueLoop(buffer);
			int numAreas = buffer.readUnsignedByte();
			for (int i = 0; i < numAreas; i++) {
				Class86.CUTSCENE_AREAS.append(new CutsceneArea(buffer));
			}
			int i_5 = buffer.readUnsignedSmart();
			Class86.CUTSCENE_CAMERA_MOVEMENTS = new CutsceneCameraMovement[i_5];
			for (int i_6 = 0; i_6 < i_5; i_6++) {
				Class86.CUTSCENE_CAMERA_MOVEMENTS[i_6] = new CutsceneCameraMovement(buffer);
			}
			int i_6 = buffer.readUnsignedSmart();
			Class82.CUTSCENE_ENTITIES = new CutsceneEntity[i_6];
			int i_14;
			for (i_14 = 0; i_14 < i_6; i_14++) {
				Class82.CUTSCENE_ENTITIES[i_14] = new CutsceneEntity(buffer, i_14);
			}
			i_14 = buffer.readUnsignedSmart();
			Class86.CUTSCENE_OBJECTS = new CutsceneObject[i_14];
			int i_8;
			for (i_8 = 0; i_8 < i_14; i_8++) {
				Class86.CUTSCENE_OBJECTS[i_8] = new CutsceneObject(buffer);
			}
			i_8 = buffer.readUnsignedSmart();
			Class86.aClass93Array821 = new CutsceneEntityMovement[i_8];
			int i_9;
			for (i_9 = 0; i_9 < i_8; i_9++) {
				Class86.aClass93Array821[i_9] = new CutsceneEntityMovement(buffer);
			}
			i_9 = buffer.readUnsignedSmart();
			Class86.aCutsceneActionArray822 = new CutsceneAction[i_9];
			for (int i_10 = 0; i_10 < i_9; i_10++) {
				Class86.aCutsceneActionArray822[i_10] = decodeMiscActions(buffer);
			}
			ReflectionCheck.aClass85_8039 = Class85.aClass85_816;
		}
		if (Class85.aClass85_816 == ReflectionCheck.aClass85_8039) {
			boolean bool_11 = true;
			CutsceneEntity[] arr_16 = Class82.CUTSCENE_ENTITIES;
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
			CutsceneObject[] arr_17 = Class86.CUTSCENE_OBJECTS;
			for (int i_6 = 0; i_6 < arr_17.length; i_6++) {
				CutsceneObject class92_7 = arr_17[i_6];
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

	static CutsceneAction decodeMiscActions(RsByteBuffer buffer) {
		int i_2 = buffer.readUnsignedByte();
		CutsceneActionType type = QuickChatMessage.method6156(i_2);
		Object action = null;
		switch (type.id) {
		case 0:
			action = new CutsceneAction_Sub15(buffer);
			break;
		case 1:
			action = new CutsceneAction_Sub20(buffer);
			break;
		case 2:
			action = new ApplyHitmarkCutsceneAction(buffer);
		case 3:
		case 7:
		case 21:
		default:
			break;
		case 4:
			action = new CutsceneAction_Sub4(buffer);
			break;
		case 5:
			action = new PlaySoundJingleCutsceneAction(buffer);
			break;
		case 6:
			action = new PlaySoundVorbisCutsceneAction(buffer);
			break;
		case 8:
			action = new CutsceneAction_Sub5(buffer);
			break;
		case 9:
			action = new CutsceneAction_Sub22(buffer);
			break;
		case 10:
			action = new CutsceneAction_Sub16(buffer, false);
			break;
		case 11:
			action = new CutsceneAction_Sub11(buffer);
			break;
		case 12:
			action = new CutsceneAction_Sub7(buffer);
			break;
		case 13:
			action = new ObjectAnimationCutsceneAction(buffer);
			break;
		case 14:
			action = new CutsceneAction_Sub10_Sub2(buffer);
			break;
		case 15:
			action = new ProjectileCutsceneAction(buffer, 0, 0);
			break;
		case 16:
			action = new SendFinishedCutsceneAction(buffer);
			break;
		case 17:
			action = new CutsceneAction_Sub17(buffer);
			break;
		case 18:
			action = new CutsceneAction_Sub9(buffer);
			break;
		case 19:
			action = new ProjectileCutsceneAction(buffer, 1, 0);
			break;
		case 20:
			action = new CutsceneAction_Sub6(buffer);
			break;
		case 22:
			action = new CutsceneAction_Sub12(buffer);
			break;
		case 23:
			action = new PlaySynthCutsceneAction(buffer);
			break;
		case 24:
			action = new ProjectileCutsceneAction(buffer, 0, 1);
			break;
		case 25:
			action = new CutsceneAction_Sub10_Sub1(buffer);
			break;
		case 26:
			action = new CutsceneAction_Sub18(buffer);
			break;
		case 27:
			action = new CutsceneAction_Sub16(buffer, true);
			break;
		case 28:
			action = new ProjectileCutsceneAction(buffer, 1, 1);
			break;
		case 29:
			action = new CutsceneAction_Sub2(buffer);
			break;
		case 30:
			action = new CutsceneAction_Sub23(buffer);
		}
		return (CutsceneAction) action;
	}

	static void readValueLoop(RsByteBuffer rsbytebuffer_0) {
		while (true) {
			int i_2 = rsbytebuffer_0.readUnsignedByte();
			switch (i_2) {
			case 0:
				Class86.anInt825 = rsbytebuffer_0.readUnsignedShort();
				Class86.anInt824 = rsbytebuffer_0.readUnsignedShort();
				break;
			case 255:
				return;
			}
		}
	}

}
