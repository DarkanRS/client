package com.rs.jagex;

public class Camera {
	public enum CamState {
		IDK_0,
		SMOOTH_RESETTING,
		FOLLOW_PLAYER,
		IDK_3,
		IDK_4,
		IDK_5
	}
	
	static boolean[] SHAKING;
	static int[] SHAKE_1;
	static int[] SHAKE_2;
	static int[] SHAKE_3;
	static int[] SHAKE_4;
	
	public static int anInt9368;
	public static int anInt4280;
	public static int CAM_MOVE_ABSOLUTEX;
	static int anInt1527;
	static int anInt5606;
	static int anInt5828;
	public static int anInt5930;
	static int anInt3512;
	static int anInt1525;
	public static CamState STATE;
	public static int anInt833;
	public static int anInt5864;
	public static int CAM_MOVE_LOCALX;
	public static int CAM_MOVE_LOCALY;
	static int CAM_MOVE_Z;
	static int CAM_MOVE_CONST_SPEED;
	static int CAM_MOVE_VAR_SPEED;
	public static int CAM_MOVE_ABSOLUTEY;
	static int CAM_MOVE_ABSOLUTEZ;
	public static float camAngleX;
	public static float camAngleY;
	public static int anInt122;
	public static int anInt3289;
	static int anInt7273;

	public static void lookAt(int x, int y, int height, int startSpeed, int deccelTo) {
		anInt9368 = x;
		anInt4280 = y;
		anInt1527 = height;
		anInt5606 = startSpeed;
		anInt5828 = deccelTo;
		if (anInt5828 >= 100) {
			int i_6 = anInt9368 * 512 + 256;
			int i_7 = anInt4280 * 512 + 256;
			int i_8 = Class504.getTerrainHeightAtPos(i_6, i_7, Class4.MY_PLAYER_PLANE) - anInt1527;
			int i_9 = i_6 - CAM_MOVE_ABSOLUTEX;
			int i_10 = i_8 - CAM_MOVE_ABSOLUTEZ;
			int i_11 = i_7 - CAM_MOVE_ABSOLUTEY;
			int i_12 = (int) Math.sqrt(i_9 * i_9 + i_11 * i_11);
			anInt3512 = (int) (Math.atan2(i_10, i_12) * 2607.5945876176133D) & 0x3fff;
			anInt5930 = (int) (Math.atan2(i_9, i_11) * -2607.5945876176133) & 0x3fff;
			anInt1525 = 0;
			if (anInt3512 < 1024)
				anInt3512 = 1024;
			if (anInt3512 > 3072)
				anInt3512 = 3072;
		}
		STATE = CamState.IDK_5;
		anInt833 = -1;
		anInt5864 = -1;
	}

	public static void moveTo(int localX, int localY, int moveZ, int startSpeed, int deccelTo, boolean moveInstantOver100) {
		CAM_MOVE_LOCALX = localX;
		CAM_MOVE_LOCALY = localY;
		CAM_MOVE_Z = moveZ;
		CAM_MOVE_CONST_SPEED = startSpeed;
		CAM_MOVE_VAR_SPEED = deccelTo;
		if (moveInstantOver100 && CAM_MOVE_VAR_SPEED >= 100) {
			CAM_MOVE_ABSOLUTEX = CAM_MOVE_LOCALX * 512 + 256;
			CAM_MOVE_ABSOLUTEY = CAM_MOVE_LOCALY * 512 + 256;
			CAM_MOVE_ABSOLUTEZ = Class504.getTerrainHeightAtPos(CAM_MOVE_ABSOLUTEX, CAM_MOVE_ABSOLUTEY, Class4.MY_PLAYER_PLANE) - CAM_MOVE_Z;
		}
		STATE = CamState.IDK_5;
		anInt833 = -1;
		anInt5864 = -1;
	}

	static void processCamera() {
		if (camAngleX < 1081.0F)
			camAngleX = 1081.0F;
		if (camAngleX > 2980.0F)
			camAngleX = 2980.0F;
		while (camAngleY >= 16384.0F)
			camAngleY -= 16384.0F;
		while (camAngleY < 0.0F)
			camAngleY += 16384.0F;
		RenderFlagMap regionmap_1 = IndexLoaders.MAP_REGION_DECODER.getRenderFlags();
		SceneObjectManager sceneobjectmanager_2 = IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager();
		int i_3 = anInt122 >> 9;
		int i_4 = anInt3289 >> 9;
			int i_5 = Class504.getTerrainHeightAtPos(anInt122, anInt3289, Class4.MY_PLAYER_PLANE);
			int i_6 = 0;
			if (i_3 > 3 && i_4 > 3 && i_3 < IndexLoaders.MAP_REGION_DECODER.getSizeX() - 4 && i_4 < IndexLoaders.MAP_REGION_DECODER.getSizeY() - 4)
				for (int x = i_3 - 4; x <= i_3 + 4; x++)
					for (int y = i_4 - 4; y <= i_4 + 4; y++) {
						int i_9 = Class4.MY_PLAYER_PLANE;
						if (i_9 < 3 && regionmap_1.isLowerObjectsToOverrideClipping(x, y))
							++i_9;
						int i_10 = 0;
						byte[][] bytes_11 = IndexLoaders.MAP_REGION_DECODER.method4507(i_9);
						if (bytes_11 != null)
							i_10 = (bytes_11[x][y] & 0xff) * 8 << 2;
						if (sceneobjectmanager_2.aGroundArray2591 != null && sceneobjectmanager_2.aGroundArray2591[i_9] != null) {
							int i_12 = i_5 - (sceneobjectmanager_2.aGroundArray2591[i_9].getHeight(x, y) - i_10);
							if (i_12 > i_6)
								i_6 = i_12;
						}
					}
			int i_7 = (i_6 >> 2) * 1536;
			if (i_7 > 786432)
				i_7 = 786432;
			if (i_7 < 262144)
				i_7 = 262144;
			if (i_7 > anInt7273)
				anInt7273 += (i_7 - anInt7273) / 24;
			else if (i_7 < anInt7273)
				anInt7273 += (i_7 - anInt7273) / 80;
	}

	public static void forceAngle(int i_0, int i_1, int i_2) {
		i_0 <<= 3;
		i_1 <<= 3;
		i_2 <<= 3;
		camAngleX = i_0;
		camAngleY = i_1;
		if (STATE == CamState.IDK_5) {
			anInt3512 = i_0;
			anInt5930 = i_1;
			anInt1525 = i_2;
		}
		processCamera();
		client.aBool7371 = true;
	}

	public static void resetHard() {
		for (int i_1 = 0; i_1 < 5; i_1++)
			SHAKING[i_1] = false;
		client.anInt7277 = -1;
		client.anInt7448 = -1;
		anInt5606 = 0;
		anInt5828 = 0;
		STATE = CamState.FOLLOW_PLAYER;
		anInt833 = -1;
		anInt5864 = -1;
	}
	
	public static void resetSmoothly() {
		for (int i_1 = 0; i_1 < 5; i_1++)
			SHAKING[i_1] = false;
	
		client.anInt7277 = -1;
		client.anInt7448 = -1;
		anInt5606 = 0;
		anInt5828 = 0;
		STATE = CamState.SMOOTH_RESETTING;
		anInt833 = -1;
		anInt5864 = -1;
		client.anInt7429 = client.FRAME_COUNT;
		Class186.anInt2349 = CAM_MOVE_ABSOLUTEX;
		GraphNode_Sub1_Sub2.anInt9461 = CAM_MOVE_ABSOLUTEZ;
		Node_Sub15_Sub1.anInt9575 = CAM_MOVE_ABSOLUTEY;
		ClipFlagMap.anInt3968 = anInt3512;
		ParamIndexLoader.anInt5029 = anInt5930;
	}

	static void processSmoothResetTick(int i_0) {
		int i_2 = client.FRAME_COUNT - client.anInt7429;
		if (i_2 >= 100) {
			STATE = CamState.FOLLOW_PLAYER;
			anInt833 = -1;
			anInt5864 = -1;
		} else {
			int i_3 = (int) camAngleX;
			if (anInt7273 >> 8 > i_3)
				i_3 = anInt7273 >> 8;
			if (SHAKING[4] && SHAKE_2[4] + 128 > i_3)
				i_3 = SHAKE_2[4] + 128;
			int i_4 = (int) camAngleY + client.anInt7343 & 0x3fff;
			Vector3 vector3_5 = VertexNormal.MY_PLAYER.method11166().coords;
			LoadingStage.method6683(anInt122, Class504.getTerrainHeightAtPos((int) vector3_5.x, (int) vector3_5.z, Class4.MY_PLAYER_PLANE) - 200, anInt3289, i_3, i_4, (i_3 >> 3) * 3 + 600 << 2, i_0);
			float f_6 = 1.0F - ((100 - i_2) * (100 - i_2) * (100 - i_2)) / 1000000.0F;
			CAM_MOVE_ABSOLUTEX = (int) (Class186.anInt2349 + f_6 * (CAM_MOVE_ABSOLUTEX - Class186.anInt2349));
			CAM_MOVE_ABSOLUTEZ = (int) (GraphNode_Sub1_Sub2.anInt9461 + f_6 * (CAM_MOVE_ABSOLUTEZ - GraphNode_Sub1_Sub2.anInt9461));
			CAM_MOVE_ABSOLUTEY = (int) ((CAM_MOVE_ABSOLUTEY - Node_Sub15_Sub1.anInt9575) * f_6 + Node_Sub15_Sub1.anInt9575);
			anInt3512 = (int) (ClipFlagMap.anInt3968 + f_6 * (anInt3512 - ClipFlagMap.anInt3968));
			int i_7 = anInt5930 - ParamIndexLoader.anInt5029;
			if (i_7 > 8192)
				i_7 -= 16384;
			else if (i_7 < -8192)
				i_7 += 16384;
			anInt5930 = (int) (ParamIndexLoader.anInt5029 + f_6 * i_7);
			anInt5930 &= 0x3fff;
		}
	}
}
