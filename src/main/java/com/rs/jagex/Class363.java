package com.rs.jagex;

public class Class363 {

	public static int anInt4203;

	static void method6286(long long_0) {
		Vector3 vector3_2 = VertexNormal.MY_PLAYER.method11166().coords;
		int i_3 = (int) vector3_2.x + client.anInt7248;
		int i_4 = (int) vector3_2.z + client.anInt7250;
		if (Camera.anInt122 - i_3 < -2000 || Camera.anInt122 - i_3 > 2000 || Camera.anInt3289 - i_4 < -2000 || Camera.anInt3289 - i_4 > 2000) {
			Camera.anInt122 = i_3;
			Camera.anInt3289 = i_4;
		}
		int i_5;
		int i_6;
		if (i_3 != Camera.anInt122) {
			i_5 = i_3 - Camera.anInt122;
			i_6 = (int) (long_0 * i_5 / 320L);
			if (i_5 > 0) {
				if (i_6 == 0)
					i_6 = 1;
				else if (i_6 > i_5)
					i_6 = i_5;
			} else if (i_6 == 0)
				i_6 = -1;
			else if (i_6 < i_5)
				i_6 = i_5;
			Camera.anInt122 += i_6;
		}
		if (i_4 != Camera.anInt3289) {
			i_5 = i_4 - Camera.anInt3289;
			i_6 = (int) (long_0 * i_5 / 320L);
			if (i_5 > 0) {
				if (i_6 == 0)
					i_6 = 1;
				else if (i_6 > i_5)
					i_6 = i_5;
			} else if (i_6 == 0)
				i_6 = -1;
			else if (i_6 < i_5)
				i_6 = i_5;
			Camera.anInt3289 += i_6;
		}
		Camera.camAngleY += client.aFloat7266 * long_0 / 6.0F;
		Camera.camAngleX += client.aFloat7284 * long_0 / 6.0F;
		Camera.processCamera();
	}

	static void method6287(PathingEntity animable_0, boolean bool_1) {
		int moveType = MoveSpeed.STATIONARY.id;
		int i_4 = 0;
		if (animable_0.forceMovementT1Delay > client.FRAME_COUNT)
			Static.method4281(animable_0);
		else if (animable_0.forceMovementT2Delay >= client.FRAME_COUNT)
			ProcessorSpecs.method7727(animable_0);
		else {
			SystemInfo.method13466(animable_0, bool_1);
			moveType = IdentikitDefinition.anInt430;
			i_4 = FontRenderer_Sub1.anInt8515;
		}
		Vector3 vector3_5 = animable_0.method11166().coords;
		int i_6;
		if ((int) vector3_5.x < 512 || (int) vector3_5.z < 512 || (int) vector3_5.x >= (IndexLoaders.MAP_REGION_DECODER.getSizeX() - 1) * 512 || (int) vector3_5.z >= (IndexLoaders.MAP_REGION_DECODER.getSizeY() - 1) * 512) {
			animable_0.currentAnimation.update(-1);
			for (i_6 = 0; i_6 < animable_0.spotAnims.length; i_6++) {
				animable_0.spotAnims[i_6].spotAnimId = -1;
				animable_0.spotAnims[i_6].animation.update(-1);
			}
			animable_0.currentAnimations = null;
			animable_0.forceMovementT1Delay = 0;
			animable_0.forceMovementT2Delay = 0;
			moveType = MoveSpeed.STATIONARY.id;
			i_4 = 0;
			animable_0.method11172((512 * animable_0.regionBaseX[0] + animable_0.getSize() * 256), vector3_5.y, (animable_0.regionBaseY[0] * 512 + animable_0.getSize() * 256));
			animable_0.method15801();
		}
		if (VertexNormal.MY_PLAYER == animable_0 && ((int) vector3_5.x < 6144 || (int) vector3_5.z < 6144 || (int) vector3_5.x >= (IndexLoaders.MAP_REGION_DECODER.getSizeX() - 12) * 512 || (int) vector3_5.z >= (IndexLoaders.MAP_REGION_DECODER.getSizeY() - 12) * 512)) {
			animable_0.currentAnimation.update(-1);
			for (i_6 = 0; i_6 < animable_0.spotAnims.length; i_6++) {
				animable_0.spotAnims[i_6].spotAnimId = -1;
				animable_0.spotAnims[i_6].animation.update(-1);
			}
			animable_0.currentAnimations = null;
			animable_0.forceMovementT1Delay = 0;
			animable_0.forceMovementT2Delay = 0;
			moveType = MoveSpeed.STATIONARY.id;
			i_4 = 0;
			animable_0.method11172((animable_0.regionBaseX[0] * 512 + animable_0.getSize() * 256), vector3_5.y, (512 * animable_0.regionBaseY[0] + animable_0.getSize() * 256));
			animable_0.method15801();
		}
		i_6 = MapSpriteIndexLoader.method7188(animable_0);
		WallDecoration.method16087(animable_0);
		Class302.handleMovementAnimations(animable_0, moveType, i_4, i_6);
		Class236.method3985(animable_0, moveType);
		Class150.method2581(animable_0);
		Quaternion quaternion_7 = Quaternion.create();
		quaternion_7.romYawPitchRoll(Trig.degToRad(animable_0.aClass19_10359.method578()), Trig.degToRad(animable_0.aClass19_10330.method578()), Trig.degToRad(animable_0.aClass19_10360.method578()));
		animable_0.method11187(quaternion_7);
		quaternion_7.cache();
	}

	Class363() throws Throwable {
		throw new Error();
	}
}
