package com.jagex;

public class QuickchatMessageDefinitions extends CacheableNode {

	static boolean method14921(int i_0, int i_1, int i_2) {
		SceneObjectManager sceneobjectmanager_4 = IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager();
		boolean bool_5 = true;
		WorldObject sceneobject_6 = (WorldObject) sceneobjectmanager_4.getWall(i_0, i_1, i_2);
		if (sceneobject_6 != null)
			bool_5 &= CutsceneEntityMovement.method1577(sceneobject_6);

		sceneobject_6 = (WorldObject) sceneobjectmanager_4.getInteractableObject(i_0, i_1, i_2, client.anInterface25_7446);
		if (sceneobject_6 != null)
			bool_5 &= CutsceneEntityMovement.method1577(sceneobject_6);

		sceneobject_6 = (WorldObject) sceneobjectmanager_4.getGroundDecoration(i_0, i_1, i_2);
		if (sceneobject_6 != null)
			bool_5 &= CutsceneEntityMovement.method1577(sceneobject_6);

		return bool_5;
	}
	public int[] responses;
	public boolean searchable = true;
	QuickchatMessageLoader aClass429_9623;
	String[] message;
	int[] types;

	int[][] configs;

	void decode(ByteBuf buffer, int opcode) {
		if (opcode == 1)
			message = MovingAnimation.split(buffer.readString(), '<');
		else if (opcode == 2) {
			int i_4 = buffer.readUnsignedByte();
			responses = new int[i_4];

			for (int i_5 = 0; i_5 < i_4; i_5++)
				responses[i_5] = buffer.readUnsignedShort();
		} else if (opcode == 3) {
			int count = buffer.readUnsignedByte();
			types = new int[count];
			configs = new int[count][];

			for (int i = 0; i < count; i++) {
				int typeId = buffer.readUnsignedShort();
				QuickChatValueType type = QuickChatValueType.get(typeId);
				if (type != null) {
					types[i] = typeId;
					configs[i] = new int[type.paramCount];

					for (int config = 0; config < type.paramCount; config++)
						configs[i][config] = buffer.readUnsignedShort();
				}
			}
		} else if (opcode == 4)
			searchable = false;
	}

	public String fillDynamicValues(ByteBuf rsbytebuffer_1) {
		StringBuilder stringbuilder_3 = new StringBuilder(80);
		if (types != null)
			for (int i_4 = 0; i_4 < types.length; i_4++) {
				stringbuilder_3.append(message[i_4]);
				stringbuilder_3.append(aClass429_9623.method7212(method14918(i_4), configs[i_4], rsbytebuffer_1.readSize(QuickChatValueType.get(types[i_4]).serverTransmitSize)));
			}

		stringbuilder_3.append(message[message.length - 1]);
		return stringbuilder_3.toString();
	}

	public void method14896(ByteBuf rsbytebuffer_1, int[] ints_2) {
		if (types != null)
			for (int i_4 = 0; i_4 < types.length && i_4 < ints_2.length; i_4++) {
				int i_5 = method14918(i_4).clientTransmitSize;
				if (i_5 > 0)
					rsbytebuffer_1.method13068(ints_2[i_4], i_5);
			}

	}

	public String method14898() {
		StringBuilder stringbuilder_2 = new StringBuilder(80);
		if (message == null)
			return "";
		stringbuilder_2.append(message[0]);

		for (int i_3 = 1; i_3 < message.length; i_3++) {
			for (int i_4 = 0; i_4 < 3; i_4++)
				stringbuilder_2.append('.');

			stringbuilder_2.append(message[i_3]);
		}

		return stringbuilder_2.toString();
	}

	public int method14901(int i_1, int i_2) {
		return types != null && i_1 >= 0 && i_1 <= types.length ? (configs[i_1] != null && i_2 >= 0 && i_2 <= configs[i_1].length ? configs[i_1][i_2] : -1) : -1;
	}

	void method14912() {
		if (responses != null)
			for (int i_2 = 0; i_2 < responses.length; i_2++)
				responses[i_2] |= 0x8000;

	}

	void method14913(ByteBuf rsbytebuffer_1) {
		while (true) {
			int i_3 = rsbytebuffer_1.readUnsignedByte();
			if (i_3 == 0)
				return;

			decode(rsbytebuffer_1, i_3);
		}
	}

	public int method14916() {
		return types == null ? 0 : types.length;
	}

	public QuickChatValueType method14918(int i_1) {
		return types != null && i_1 >= 0 && i_1 <= types.length ? QuickChatValueType.get(types[i_1]) : null;
	}

}
