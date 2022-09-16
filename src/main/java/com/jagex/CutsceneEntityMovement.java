package com.jagex;

import java.util.Calendar;

import jaclib.ping.IcmpService;

public class CutsceneEntityMovement {

	public static void method1568() {
		LRUCache softcache_1 = PlayerModel.aClass229_2920;
		synchronized (PlayerModel.aClass229_2920) {
			PlayerModel.aClass229_2920.method3863();
		}
		softcache_1 = PlayerModel.aClass229_2930;
		synchronized (PlayerModel.aClass229_2930) {
			PlayerModel.aClass229_2930.method3863();
		}
	}
	public static void method1575(int fileId, int i_1, boolean bool_2) {
		if (Class492.INDEX36_FILE_CACHE.get(fileId) == null)
			if (!client.aBool7393)
				Class62.method1260(fileId, bool_2);
			else {
				VorbisNode class282_sub37_4 = new VorbisNode(fileId, new VorbisFileReference(IndexLoaders.VORBIS_INDEX, fileId), i_1, bool_2);
				class282_sub37_4.vfReference.method4915(Class223.CURRENT_LANGUAGE.method8276());
				Class492.INDEX36_FILE_CACHE.put(class282_sub37_4, fileId);
			}
	}

	public static boolean method1576() {
		try {
			if (!IcmpService.available()) {
				boolean bool_1 = false;
				return bool_1;
			}
		} catch (Throwable throwable_4) {
			return false;
		}
		if (IcmpService_Sub1.anIcmpService_Sub1_7964 != null)
			throw new IllegalStateException("");
		IcmpService_Sub1.anIcmpService_Sub1_7964 = new IcmpService_Sub1();
		Thread thread_3 = new Thread(new Class512());
		thread_3.setDaemon(true);
		thread_3.start();
		return true;
	}

	static boolean method1577(WorldObject sceneobject_0) {
		ObjectDefinition objectdefinitions_2 = IndexLoaders.MAP_REGION_DECODER.method4436().getObjectDefs(sceneobject_0.getId());
		if (objectdefinitions_2.mapSpriteId == -1)
			return true;
		MapSpriteDefinitions class418_3 = IndexLoaders.MAP_SPRITE_LOADER.method7172(objectdefinitions_2.mapSpriteId);
		return class418_3.anInt4995 == -1 || class418_3.method7015();
	}

	static String method1578(long long_0) {
		Class155.method2634(long_0);
		int i_4 = Class407.aCalendar4848.get(Calendar.DATE);
		int i_5 = Class407.aCalendar4848.get(Calendar.MONTH) + 1;
		int i_6 = Class407.aCalendar4848.get(Calendar.YEAR);
		return Integer.toString(i_4 / 10) + i_4 % 10 + "/" + i_5 / 10 + i_5 % 10 + "/" + i_6 % 100 / 10 + i_6 % 10;
	}

	int[] movementTypes;

	int[] movementCoordinates;

	CutsceneEntityMovement(ByteBuf rsbytebuffer_1) {
		int i_2 = rsbytebuffer_1.readSmart();
		movementTypes = new int[i_2];
		movementCoordinates = new int[i_2];
		for (int i_3 = 0; i_3 < i_2; i_3++) {
			int i_4 = rsbytebuffer_1.readUnsignedByte();
			movementTypes[i_3] = i_4;
			int i_5 = rsbytebuffer_1.readUnsignedShort();
			int i_6 = rsbytebuffer_1.readUnsignedShort();
			movementCoordinates[i_3] = i_6 + (i_5 << 16);
		}
	}

	void method1566(CutsceneEntity entity, int i_2) {
		int i_4 = movementCoordinates[0];
		entity.method1338(i_2, i_4 >>> 16, i_4 & 0xffff);
		PathingEntity animable_5 = entity.method1342();
		animable_5.anInt10355 = 0;
		for (int i_6 = movementTypes.length - 1; i_6 >= 0; --i_6) {
			int i_7 = movementTypes[i_6];
			int i_8 = movementCoordinates[i_6];
			animable_5.regionBaseX[animable_5.anInt10355] = i_8 >> 16;
			animable_5.regionBaseY[animable_5.anInt10355] = i_8 & 0xffff;
			byte b_9 = MoveSpeed.WALKING.id;
			if (i_7 == 0)
				b_9 = MoveSpeed.HALF_WALK.id;
			else if (i_7 == 2)
				b_9 = MoveSpeed.RUNNING.id;
			animable_5.walkTypes[animable_5.anInt10355] = b_9;
			++animable_5.anInt10355;
		}
	}
}
