public final class CutsceneEntity {

	static Index aClass317_746;
	static int anInt747;
	public boolean initialized = false;
	Player player = null;
	NPC npc = null;
	int[] animations;
	int index;
	public int id;

	void move(int y, int plane, int x, int direction) {
		if (!this.initialized) {
			this.initialized = true;
			if (this.id >= 0) {
				this.npc = new NPC(IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager());
				this.npc.index = this.index;
				this.npc.lastUpdate = client.cycles;
				this.npc.setDefinition(IndexLoaders.NPC_INDEX_LOADER.getNPCDefinitions(this.id));
				this.npc.setBoundSize(this.npc.definitions.size);
				this.npc.anInt10340 = this.npc.definitions.contrast << 3;
				this.npc.drawPriority = ++Class86.anInt819 - 1;
			} else {
				this.player = new Player(IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager());
				this.player.decodeAppearance(Class276.aNode_Sub35_3346);
				this.player.index = this.index;
				this.player.lastUpdate = client.cycles;
				this.player.drawPriority = ++Class86.anInt819 - 1;
			}
		}
		if (this.id >= 0) {
			this.npc.move(x, y, plane, true, this.npc.getSize());
			this.npc.turn(direction, true);
		} else {
			this.player.plane = this.player.collisionPlane = (byte) x;
			this.player.move(y, plane);
			this.player.turn(direction, true);
		}
	}

	void method1337(int i_1) {
		this.npc = null;
		this.player = null;
		this.initialized = false;
	}

	void method1338(int i_1, int i_2, int i_3) {
		if (this.npc != null) {
			this.npc.move(i_1, i_2, i_3, true, this.npc.getSize());
		} else {
			this.player.plane = this.player.collisionPlane = (byte) i_1;
			this.player.move(i_2, i_3);
		}
	}

	boolean ready() {
		if (this.id < 0) {
			return true;
		} else {
			NPCDefinitions npcdefinitions_2 = IndexLoaders.NPC_INDEX_LOADER.getNPCDefinitions(this.id);
			boolean bool_3 = npcdefinitions_2.method6881();
			if (this.animations == null) {
				BASDefinitions renderanimdefs_4 = IndexLoaders.RENDER_ANIM_LOADER.getBASDefs(npcdefinitions_2.renderEmote, (byte) -42);
				this.animations = renderanimdefs_4.method3828();
			}
			int[] ints_7 = this.animations;
			for (int i_5 = 0; i_5 < ints_7.length; i_5++) {
				int i_6 = ints_7[i_5];
				bool_3 &= IndexLoaders.ANIMATION_LOADER.getAnimDefs(i_6, (byte) 91).ready();
			}
			return bool_3;
		}
	}

	public Entity method1342(byte b_1) {
		return (Entity) (this.npc != null ? this.npc : this.player);
	}

	CutsceneEntity(RsByteBuffer buffer, int index) {
		this.index = index;
		int type = buffer.readUnsignedByte();
		switch (type) {
		case 0:
			this.id = buffer.readBigSmart();
			break;
		case 1:
			this.id = -1;
			break;
		default:
			this.id = -1;
		}
		buffer.readString();
	}

	public static String method1353(String string_0) {
		StringBuilder stringbuilder_2 = new StringBuilder();
		int i_3 = string_0.length();
		for (int i_4 = 0; i_4 < i_3; i_4++) {
			char var_5 = string_0.charAt(i_4);
			if (var_5 == 37 && i_3 > i_4 + 2) {
				var_5 = string_0.charAt(i_4 + 1);
				boolean bool_6 = false;
				int i_7;
				if (var_5 >= 48 && var_5 <= 57) {
					i_7 = var_5 - 48;
				} else if (var_5 >= 97 && var_5 <= 102) {
					i_7 = var_5 + 10 - 97;
				} else {
					if (var_5 < 65 || var_5 > 70) {
						stringbuilder_2.append('%');
						continue;
					}
					i_7 = var_5 + 10 - 65;
				}
				i_7 *= 16;
				char var_8 = string_0.charAt(i_4 + 2);
				if (var_8 >= 48 && var_8 <= 57) {
					i_7 += var_8 - 48;
				} else if (var_8 >= 97 && var_8 <= 102) {
					i_7 += var_8 + 10 - 97;
				} else {
					if (var_8 < 65 || var_8 > 70) {
						stringbuilder_2.append('%');
						continue;
					}
					i_7 += var_8 + 10 - 65;
				}
				if (i_7 != 0 && Class209.method3600((byte) i_7)) {
					stringbuilder_2.append(Utils.cp1252ToChar((byte) i_7));
				}
				i_4 += 2;
			} else if (var_5 == 43) {
				stringbuilder_2.append(' ');
			} else {
				stringbuilder_2.append(var_5);
			}
		}
		return stringbuilder_2.toString();
	}

	static String method1354(CacheableNode_Sub15 class282_sub50_sub15_0) {
		return class282_sub50_sub15_0.aString9771 + Utils.rgbToColHexShortcut(16777215) + " >";
	}
}
