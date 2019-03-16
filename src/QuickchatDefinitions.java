public class QuickchatDefinitions extends CacheableNode {

	QuickchatDefinitionsLoader aClass429_9623;
	String[] messages;
	public int[] anIntArray9624;
	int[] dynamicValueTypes;
	int[][] anIntArrayArray9626;
	public boolean aBool9628 = true;

	void decode(RsByteBuffer rsbytebuffer_1, int i_2) {
		if (i_2 == 1) {
			this.messages = MovingAnimation.method12681(rsbytebuffer_1.readString(), '<');
		} else {
			int i_4;
			int i_5;
			if (i_2 == 2) {
				i_4 = rsbytebuffer_1.readUnsignedByte();
				this.anIntArray9624 = new int[i_4];

				for (i_5 = 0; i_5 < i_4; i_5++) {
					this.anIntArray9624[i_5] = rsbytebuffer_1.readUnsignedShort();
				}
			} else if (i_2 == 3) {
				i_4 = rsbytebuffer_1.readUnsignedByte();
				this.dynamicValueTypes = new int[i_4];
				this.anIntArrayArray9626 = new int[i_4][];

				for (i_5 = 0; i_5 < i_4; i_5++) {
					int i_6 = rsbytebuffer_1.readUnsignedShort();
					QuickChatDynamicValue quickchatdynamicvalue_7 = QuickChatDynamicValue.get(i_6, (byte) -5);
					if (quickchatdynamicvalue_7 != null) {
						this.dynamicValueTypes[i_5] = i_6;
						this.anIntArrayArray9626[i_5] = new int[quickchatdynamicvalue_7.paramCount];

						for (int i_8 = 0; i_8 < quickchatdynamicvalue_7.paramCount; i_8++) {
							this.anIntArrayArray9626[i_5][i_8] = rsbytebuffer_1.readUnsignedShort();
						}
					}
				}
			} else if (i_2 == 4) {
				this.aBool9628 = false;
			}
		}

	}

	public void method14896(RsByteBuffer rsbytebuffer_1, int[] ints_2, int i_3) {
		if (this.dynamicValueTypes != null) {
			for (int i_4 = 0; i_4 < this.dynamicValueTypes.length && i_4 < ints_2.length; i_4++) {
				int i_5 = this.method14918(i_4, -218667909).clientTransmitSize;
				if (i_5 > 0) {
					rsbytebuffer_1.method13068((long) ints_2[i_4], i_5);
				}
			}
		}

	}

	public String fillDynamicValues(RsByteBuffer rsbytebuffer_1) {
		StringBuilder stringbuilder_3 = new StringBuilder(80);
		if (this.dynamicValueTypes != null) {
			for (int i_4 = 0; i_4 < this.dynamicValueTypes.length; i_4++) {
				stringbuilder_3.append(this.messages[i_4]);
				stringbuilder_3.append(this.aClass429_9623.method7212(this.method14918(i_4, 12195822), this.anIntArrayArray9626[i_4], rsbytebuffer_1.method13089(QuickChatDynamicValue.get(this.dynamicValueTypes[i_4], (byte) -21).serverTransmitSize)));
			}
		}

		stringbuilder_3.append(this.messages[this.messages.length - 1]);
		return stringbuilder_3.toString();
	}

	public String method14898(int i_1) {
		StringBuilder stringbuilder_2 = new StringBuilder(80);
		if (this.messages == null) {
			return "";
		} else {
			stringbuilder_2.append(this.messages[0]);

			for (int i_3 = 1; i_3 < this.messages.length; i_3++) {
				for (int i_4 = 0; i_4 < 3; i_4++) {
					stringbuilder_2.append('.');
				}

				stringbuilder_2.append(this.messages[i_3]);
			}

			return stringbuilder_2.toString();
		}
	}

	public int method14901(int i_1, int i_2) {
		return this.dynamicValueTypes != null && i_1 >= 0 && i_1 <= this.dynamicValueTypes.length ? (this.anIntArrayArray9626[i_1] != null && i_2 >= 0 && i_2 <= this.anIntArrayArray9626[i_1].length ? this.anIntArrayArray9626[i_1][i_2] : -1) : -1;
	}

	void method14912() {
		if (this.anIntArray9624 != null) {
			for (int i_2 = 0; i_2 < this.anIntArray9624.length; i_2++) {
				this.anIntArray9624[i_2] |= 0x8000;
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
		return this.dynamicValueTypes == null ? 0 : this.dynamicValueTypes.length;
	}

	public QuickChatDynamicValue method14918(int i_1, int i_2) {
		return this.dynamicValueTypes != null && i_1 >= 0 && i_1 <= this.dynamicValueTypes.length ? QuickChatDynamicValue.get(this.dynamicValueTypes[i_1], (byte) -128) : null;
	}

	static boolean method14921(int i_0, int i_1, int i_2) {
		SceneObjectManager sceneobjectmanager_4 = IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager(-1536948250);
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
