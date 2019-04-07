public class QuickchatMessageDefinitions extends CacheableNode {

	QuickchatMessageLoader aClass429_9623;
	String[] message;
	public int[] responses;
	int[] types;
	int[][] configs;
	public boolean searchable = true;

	void decode(RsByteBuffer buffer, int opcode) {
		if (opcode == 1) {
			this.message = MovingAnimation.method12681(buffer.readString(), '<');
		} else if (opcode == 2) {
			int i_4 = buffer.readUnsignedByte();
			this.responses = new int[i_4];

			for (int i_5 = 0; i_5 < i_4; i_5++) {
				this.responses[i_5] = buffer.readUnsignedShort();
			}
		} else if (opcode == 3) {
			int count = buffer.readUnsignedByte();
			this.types = new int[count];
			this.configs = new int[count][];

			for (int i = 0; i < count; i++) {
				int typeId = buffer.readUnsignedShort();
				QuickChatValueType type = QuickChatValueType.get(typeId);
				if (type != null) {
					this.types[i] = typeId;
					this.configs[i] = new int[type.paramCount];

					for (int config = 0; config < type.paramCount; config++) {
						this.configs[i][config] = buffer.readUnsignedShort();
					}
				}
			}
		} else if (opcode == 4) {
			this.searchable = false;
		}
	}

	public void method14896(RsByteBuffer rsbytebuffer_1, int[] ints_2, int i_3) {
		if (this.types != null) {
			for (int i_4 = 0; i_4 < this.types.length && i_4 < ints_2.length; i_4++) {
				int i_5 = this.method14918(i_4, -218667909).clientTransmitSize;
				if (i_5 > 0) {
					rsbytebuffer_1.method13068((long) ints_2[i_4], i_5);
				}
			}
		}

	}

	public String fillDynamicValues(RsByteBuffer rsbytebuffer_1) {
		StringBuilder stringbuilder_3 = new StringBuilder(80);
		if (this.types != null) {
			for (int i_4 = 0; i_4 < this.types.length; i_4++) {
				stringbuilder_3.append(this.message[i_4]);
				stringbuilder_3.append(this.aClass429_9623.method7212(this.method14918(i_4, 12195822), this.configs[i_4], rsbytebuffer_1.readSize(QuickChatValueType.get(this.types[i_4]).serverTransmitSize)));
			}
		}

		stringbuilder_3.append(this.message[this.message.length - 1]);
		return stringbuilder_3.toString();
	}

	public String method14898(int i_1) {
		StringBuilder stringbuilder_2 = new StringBuilder(80);
		if (this.message == null) {
			return "";
		} else {
			stringbuilder_2.append(this.message[0]);

			for (int i_3 = 1; i_3 < this.message.length; i_3++) {
				for (int i_4 = 0; i_4 < 3; i_4++) {
					stringbuilder_2.append('.');
				}

				stringbuilder_2.append(this.message[i_3]);
			}

			return stringbuilder_2.toString();
		}
	}

	public int method14901(int i_1, int i_2) {
		return this.types != null && i_1 >= 0 && i_1 <= this.types.length ? (this.configs[i_1] != null && i_2 >= 0 && i_2 <= this.configs[i_1].length ? this.configs[i_1][i_2] : -1) : -1;
	}

	void method14912() {
		if (this.responses != null) {
			for (int i_2 = 0; i_2 < this.responses.length; i_2++) {
				this.responses[i_2] |= 0x8000;
			}
		}

	}

	void method14913(RsByteBuffer rsbytebuffer_1) {
		while (true) {
			int i_3 = rsbytebuffer_1.readUnsignedByte();
			if (i_3 == 0) {
				return;
			}

			this.decode(rsbytebuffer_1, i_3);
		}
	}

	public int method14916(int i_1) {
		return this.types == null ? 0 : this.types.length;
	}

	public QuickChatValueType method14918(int i_1, int i_2) {
		return this.types != null && i_1 >= 0 && i_1 <= this.types.length ? QuickChatValueType.get(this.types[i_1]) : null;
	}

	static boolean method14921(int i_0, int i_1, int i_2) {
		SceneObjectManager sceneobjectmanager_4 = IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager();
		boolean bool_5 = true;
		SceneObject sceneobject_6 = (SceneObject) sceneobjectmanager_4.getWall(i_0, i_1, i_2, (byte) -61);
		if (sceneobject_6 != null) {
			bool_5 &= Class93.method1577(sceneobject_6, -1691371970);
		}

		sceneobject_6 = (SceneObject) sceneobjectmanager_4.getInteractableObject(i_0, i_1, i_2, client.anInterface25_7446);
		if (sceneobject_6 != null) {
			bool_5 &= Class93.method1577(sceneobject_6, -1754652045);
		}

		sceneobject_6 = (SceneObject) sceneobjectmanager_4.getGroundDecoration(i_0, i_1, i_2);
		if (sceneobject_6 != null) {
			bool_5 &= Class93.method1577(sceneobject_6, -1776795369);
		}

		return bool_5;
	}

}
