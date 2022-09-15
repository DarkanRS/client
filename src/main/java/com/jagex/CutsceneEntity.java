package com.jagex;

public class CutsceneEntity {

	static Index aClass317_746;
	static int PULSE_TIME_IDX;
	public static String method1353(String string_0) {
		StringBuilder stringbuilder_2 = new StringBuilder();
		int i_3 = string_0.length();
		for (int i_4 = 0; i_4 < i_3; i_4++) {
			char var_5 = string_0.charAt(i_4);
			if (var_5 == 37 && i_3 > i_4 + 2) {
				var_5 = string_0.charAt(i_4 + 1);
				boolean bool_6 = false;
				int i_7;
				if (var_5 >= 48 && var_5 <= 57)
					i_7 = var_5 - 48;
				else if (var_5 >= 97 && var_5 <= 102)
					i_7 = var_5 + 10 - 97;
				else {
					if (var_5 < 65 || var_5 > 70) {
						stringbuilder_2.append('%');
						continue;
					}
					i_7 = var_5 + 10 - 65;
				}
				i_7 *= 16;
				char var_8 = string_0.charAt(i_4 + 2);
				if (var_8 >= 48 && var_8 <= 57)
					i_7 += var_8 - 48;
				else if (var_8 >= 97 && var_8 <= 102)
					i_7 += var_8 + 10 - 97;
				else {
					if (var_8 < 65 || var_8 > 70) {
						stringbuilder_2.append('%');
						continue;
					}
					i_7 += var_8 + 10 - 65;
				}
				if (i_7 != 0 && Class209.method3600((byte) i_7))
					stringbuilder_2.append(Utils.cp1252ToChar((byte) i_7));
				i_4 += 2;
			} else if (var_5 == 43)
				stringbuilder_2.append(' ');
			else
				stringbuilder_2.append(var_5);
		}
		return stringbuilder_2.toString();
	}
	static String method1354(CacheableNode_Sub15 class282_sub50_sub15_0) {
		return class282_sub50_sub15_0.aString9771 + Utils.rgbToColHexShortcut(16777215) + " >";
	}
	public boolean initialized;
	public int id;
	PlayerEntity player;
	NPCEntity npc;

	int[] animations;

	int index;

	CutsceneEntity(ByteBuf buffer, int index) {
		this.index = index;
		int type = buffer.readUnsignedByte();
		id = switch (type) {
		case 0 -> buffer.readBigSmart();
		case 1 -> -1;
		default -> -1;
		};
		buffer.readString();
	}

	void method1337() {
		npc = null;
		player = null;
		initialized = false;
	}

	void method1338(int i_1, int i_2, int i_3) {
		if (npc != null)
			npc.move(i_1, i_2, i_3, true, npc.getSize());
		else {
			player.plane = player.collisionPlane = (byte) i_1;
			player.move(i_2, i_3);
		}
	}

	public PathingEntity method1342() {
		return npc != null ? npc : player;
	}

	void move(int y, int plane, int x, int direction) {
		if (!initialized) {
			initialized = true;
			if (id >= 0) {
				npc = new NPCEntity(IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager());
				npc.index = index;
				npc.lastUpdate = client.FRAME_COUNT;
				npc.setDefinition(IndexLoaders.NPC_INDEX_LOADER.getNPCType(id));
				npc.setBoundSize(npc.definitions.size);
				npc.anInt10340 = npc.definitions.contrast << 3;
				npc.drawPriority = ++Class86.anInt819 - 1;
			} else {
				player = new PlayerEntity(IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager());
				player.decodeAppearance(Class276.aNode_Sub35_3346);
				player.index = index;
				player.lastUpdate = client.FRAME_COUNT;
				player.drawPriority = ++Class86.anInt819 - 1;
			}
		}
		if (id >= 0) {
			npc.move(x, y, plane, true, npc.getSize());
			npc.turn(direction, true);
		} else {
			player.plane = player.collisionPlane = (byte) x;
			player.move(y, plane);
			player.turn(direction, true);
		}
	}

	boolean ready() {
		if (id < 0)
			return true;
		NPCDefinitions npcdefinitions_2 = IndexLoaders.NPC_INDEX_LOADER.getNPCType(id);
		boolean bool_3 = npcdefinitions_2.method6881();
		if (animations == null) {
			BASDefinitions renderanimdefs_4 = IndexLoaders.RENDER_ANIM_LOADER.getBASDefs(npcdefinitions_2.renderEmote);
			animations = renderanimdefs_4.method3828();
		}
		int[] ints_7 = animations;
		for (int i_6 : ints_7) {
			bool_3 &= IndexLoaders.ANIMATION_LOADER.getAnimDefs(i_6).ready();
		}
		return bool_3;
	}
}
