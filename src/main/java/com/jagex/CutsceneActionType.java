package com.jagex;

import com.Loader;

public class CutsceneActionType {

	static CutsceneActionType aClass411_4951 = new CutsceneActionType(8, 0);
	static CutsceneActionType aClass411_4926 = new CutsceneActionType(11, 1);
	static CutsceneActionType aClass411_4927 = new CutsceneActionType(3, 2);
	static CutsceneActionType aClass411_4928 = new CutsceneActionType(7, 3);
	static CutsceneActionType aClass411_4929 = new CutsceneActionType(4, 10);
	static CutsceneActionType aClass411_4930 = new CutsceneActionType(1, 11);
	static CutsceneActionType aClass411_4942 = new CutsceneActionType(9, 12);
	static CutsceneActionType aClass411_4944 = new CutsceneActionType(12, 13);
	static CutsceneActionType aClass411_4933 = new CutsceneActionType(26, 14);
	static CutsceneActionType aClass411_4934 = new CutsceneActionType(2, 15);
	static CutsceneActionType aClass411_4935 = new CutsceneActionType(29, 16);
	static CutsceneActionType aClass411_4936 = new CutsceneActionType(25, 17);
	static CutsceneActionType aClass411_4937 = new CutsceneActionType(20, 20);
	static CutsceneActionType aClass411_4953 = new CutsceneActionType(0, 21);
	static CutsceneActionType aClass411_4939 = new CutsceneActionType(13, 22);
	static CutsceneActionType aClass411_4940 = new CutsceneActionType(18, 30);
	static CutsceneActionType aClass411_4941 = new CutsceneActionType(23, 31);
	static CutsceneActionType aClass411_4950 = new CutsceneActionType(5, 32);
	static CutsceneActionType aClass411_4943 = new CutsceneActionType(6, 33);
	static CutsceneActionType aClass411_4954 = new CutsceneActionType(30, 40);
	static CutsceneActionType aClass411_4947 = new CutsceneActionType(17, 41);
	static CutsceneActionType aClass411_4946 = new CutsceneActionType(14, 42);
	static CutsceneActionType aClass411_4938 = new CutsceneActionType(21, 43);
	static CutsceneActionType aClass411_4948 = new CutsceneActionType(28, 50);
	static CutsceneActionType aClass411_4949 = new CutsceneActionType(24, 51);
	static CutsceneActionType aClass411_4945 = new CutsceneActionType(15, 52);
	static CutsceneActionType aClass411_4932 = new CutsceneActionType(19, 53);
	static CutsceneActionType aClass411_4952 = new CutsceneActionType(10, 60);
	static CutsceneActionType aClass411_4925 = new CutsceneActionType(27, 61);
	static CutsceneActionType aClass411_4931 = new CutsceneActionType(22, 70);
	static CutsceneActionType aClass411_4955 = new CutsceneActionType(16, 255);

	static void decodeWorldList(ByteBuf buffer) {
		int size = buffer.readSmart();
		Class354.WORLDS = new WorldType[size];
		for (int i = 0; i < size; i++) {
			Class354.WORLDS[i] = new WorldType();
			Class354.WORLDS[i].countryId = buffer.readSmart();
			Class354.WORLDS[i].activity = buffer.readGJString();
			if (Loader.DEBUG)
				System.out.println("Worldlist set: " + Class354.WORLDS[i]);
		}
		Class485.WORLD_LIST_START = buffer.readSmart();
		Class244.WORLD_LIST_SIZEPLUS1 = buffer.readSmart();
		Class4.WORLD_LIST_SIZE = buffer.readSmart();
		Class244.WORLD_LIST_DESCRIPTORS = new WorldDescriptor[Class244.WORLD_LIST_SIZEPLUS1 - Class485.WORLD_LIST_START + 1];
		for (int i = 0; i < Class4.WORLD_LIST_SIZE; i++) {
			int id = buffer.readSmart();
			WorldDescriptor world = Class244.WORLD_LIST_DESCRIPTORS[id] = new WorldDescriptor();
			world.worldIndex = buffer.readUnsignedByte();
			world.flags = buffer.readInt();
			world.worldNumber = id + Class485.WORLD_LIST_START;
			world.unknown = buffer.readGJString();
			world.ipAddress = buffer.readGJString();
			if (world.hasPort())
				world.port = buffer.readInt();
			if (Loader.DEBUG)
				System.out.println("Worldlist set: " + world);
		}
		MapSpriteDefinitions.WORLD_LIST_IDK = buffer.readInt();
		Class244.aBool3007 = true;
	}
	public static Class350 method6915(ByteBuf rsbytebuffer_0) {
		Class350 class350_2 = Class383.method6512(rsbytebuffer_0);
		int i_3 = rsbytebuffer_0.readInt();
		int i_4 = rsbytebuffer_0.readInt();
		return new Class350_Sub2(class350_2.aClass356_4094, class350_2.aClass353_4087, class350_2.anInt4090, class350_2.anInt4089, class350_2.anInt4093, class350_2.anInt4088, class350_2.anInt4092, class350_2.anInt4086, class350_2.anInt4091, i_3, i_4);
	}

	public int id;

	int anInt4957;

	CutsceneActionType(int i_1, int i_2) {
		id = i_1;
		anInt4957 = i_2;
	}
}
