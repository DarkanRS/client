package com.rs.jagex;

public class CutsceneAction_Sub4 extends CutsceneAction {

	static void method13789(MenuActionEvent event, int i_1, int i_2, int i_3) {
		if (event != null && Class20.aClass482_171.tail != event) {
			int i_4 = event.anInt9581;
			int i_5 = event.anInt9582;
			MenuAction action = event.menuAction;
			int targetKey = (int) event.aLong9584;
			long long_8 = event.aLong9584;
			action = action.removeLowPriority();
			
			CoordGrid mapBase = IndexLoaders.MAP_REGION_DECODER.getBase();
			switch(action) {
			case OP_PLAYER1, OP_PLAYER2, OP_PLAYER3, OP_PLAYER4, OP_PLAYER5, OP_PLAYER6, OP_PLAYER7, OP_PLAYER8, OP_PLAYER9, OP_PLAYER10 -> {
				PlayerEntity player = client.PLAYER_LIST[targetKey];
				if (player != null) {
					client.anInt7293 = i_1;
					client.anInt7294 = i_2;
					client.anInt7296 = 2;
					client.anInt7295 = 0;
					TCPPacket packet = TCPPacket.createPacket(action.toPacket(), client.GAME_CONNECTION_CONTEXT.outKeys);
					packet.buffer.writeShort(targetKey);
					packet.buffer.write128Byte(VertexNormal.method1465() ? 1 : 0);
					client.GAME_CONNECTION_CONTEXT.queuePacket(packet);
					MapRegion.routeTo(player.regionBaseX[0], player.regionBaseY[0], true, Class344.method6115(player.regionBaseX[0], player.regionBaseY[0], player.getSize(), player.getSize()));
				}
			}
			case TGT_PLAYER -> {
				PlayerEntity player = client.PLAYER_LIST[targetKey];
				if (player != null) {
					client.anInt7293 = i_1;
					client.anInt7294 = i_2;
					client.anInt7296 = 2;
					client.anInt7295 = 0;
					TCPPacket tcpmessage_13 = TCPPacket.createPacket(ClientProt.IF_ON_PLAYER, client.GAME_CONNECTION_CONTEXT.outKeys);
					tcpmessage_13.buffer.writeShort(client.anInt7345);
					tcpmessage_13.buffer.writeShortLE(targetKey);
					tcpmessage_13.buffer.write128Byte(VertexNormal.method1465() ? 1 : 0);
					tcpmessage_13.buffer.writeIntV2(client.anInt56);
					tcpmessage_13.buffer.writeShortLE(client.anInt7346);
					client.GAME_CONNECTION_CONTEXT.queuePacket(tcpmessage_13);
					MapRegion.routeTo(player.regionBaseX[0], player.regionBaseY[0], true, Class344.method6115(player.regionBaseX[0], player.regionBaseY[0], player.getSize(), player.getSize()));
				}
			}
			case TGT_SELF -> {
				client.anInt7293 = i_1;
				client.anInt7294 = i_2;
				client.anInt7296 = 2;
				client.anInt7295 = 0;
				TCPPacket packet = TCPPacket.createPacket(ClientProt.IF_ON_PLAYER, client.GAME_CONNECTION_CONTEXT.outKeys);
				packet.buffer.writeShort(client.anInt7345);
				packet.buffer.writeShortLE(VertexNormal.MY_PLAYER.index);
				packet.buffer.write128Byte(VertexNormal.method1465() ? 1 : 0);
				packet.buffer.writeIntV2(client.anInt56);
				packet.buffer.writeShortLE(client.anInt7346);
				client.GAME_CONNECTION_CONTEXT.queuePacket(packet);
			}
			
			case TGT_OBJ -> {
				client.anInt7293 = i_1;
				client.anInt7294 = i_2;
				client.anInt7296 = 2;
				client.anInt7295 = 0;
				TCPPacket packet = TCPPacket.createPacket(ClientProt.IF_ON_OBJECT, client.GAME_CONNECTION_CONTEXT.outKeys);
				packet.buffer.writeShortLE128(i_4 + mapBase.x);
				packet.buffer.write128Byte(VertexNormal.method1465() ? 1 : 0);
				packet.buffer.writeIntV1((int) (long_8 >>> 32) & 0x7fffffff);
				packet.buffer.writeInt(client.anInt56);
				packet.buffer.writeShortLE(client.anInt7346);
				packet.buffer.writeShort128(client.anInt7345);
				packet.buffer.writeShortLE(i_5 + mapBase.y);
				client.GAME_CONNECTION_CONTEXT.queuePacket(packet);
				Class439.routeToSceneObject(i_4, i_5, long_8);
			}
			
			case TGT_GROUND_ITEM -> {
				client.anInt7293 = i_1;
				client.anInt7294 = i_2;
				client.anInt7296 = 2;
				client.anInt7295 = 0;
				TCPPacket tcpmessage_13 = TCPPacket.createPacket(ClientProt.IF_ON_GROUND_ITEM, client.GAME_CONNECTION_CONTEXT.outKeys);
				tcpmessage_13.buffer.writeShort128(client.anInt7346);
				tcpmessage_13.buffer.writeIntV2(client.anInt56);
				tcpmessage_13.buffer.writeShort(targetKey);
				tcpmessage_13.buffer.write128Byte(VertexNormal.method1465() ? 1 : 0);
				tcpmessage_13.buffer.writeShortLE128(client.anInt7345);
				tcpmessage_13.buffer.writeShortLE128(i_5 + mapBase.y);
				tcpmessage_13.buffer.writeShortLE(i_4 + mapBase.x);
				client.GAME_CONNECTION_CONTEXT.queuePacket(tcpmessage_13);
				client.method12073(i_4, i_5);
			}
			
			case TGT_GROUND -> {
				client.anInt7293 = i_1;
				client.anInt7294 = i_2;
				client.anInt7296 = 1;
				client.anInt7295 = 0;
				TCPPacket tcpmessage_13 = TCPPacket.createPacket(ClientProt.IF_ON_TILE, client.GAME_CONNECTION_CONTEXT.outKeys);
				tcpmessage_13.buffer.writeShortLE(client.anInt7346);
				tcpmessage_13.buffer.writeShortLE(i_5 + mapBase.y);
				tcpmessage_13.buffer.writeIntV1(client.anInt56);
				tcpmessage_13.buffer.writeShort128(client.anInt7345);
				tcpmessage_13.buffer.writeShortLE(i_4 + mapBase.x);
				client.GAME_CONNECTION_CONTEXT.queuePacket(tcpmessage_13);
				MapRegion.routeTo(i_4, i_5, true, SunDefinitions.method853(i_4, i_5));
			}
			
			case OP_GROUND_ITEM1, OP_GROUND_ITEM2, OP_GROUND_ITEM3, 
				 OP_GROUND_ITEM4, OP_GROUND_ITEM5, OP_GROUND_ITEM6 -> {
				client.anInt7293 = i_1;
				client.anInt7294 = i_2;
				client.anInt7296 = 2;
				client.anInt7295 = 0;
				TCPPacket tcpmessage_22 = TCPPacket.createPacket(action.toPacket(), client.GAME_CONNECTION_CONTEXT.outKeys);
				tcpmessage_22.buffer.writeShortLE128(targetKey);
				tcpmessage_22.buffer.writeByteC(VertexNormal.method1465() ? 1 : 0);
				tcpmessage_22.buffer.writeShort(i_5 + mapBase.y);
				tcpmessage_22.buffer.writeShort128(i_4 + mapBase.x);
				client.GAME_CONNECTION_CONTEXT.queuePacket(tcpmessage_22);
				client.method12073(i_4, i_5);
			}
			
			case OP_NPC1, OP_NPC2, OP_NPC3, 
				 OP_NPC4, OP_NPC5, OP_NPC6 -> {
				ObjectNode class282_sub47_19 = (ObjectNode) client.NPC_MAP.get(targetKey);
				if (class282_sub47_19 != null) {
					NPCEntity npc_14 = (NPCEntity) class282_sub47_19.anObject8068;
					client.anInt7293 = i_1;
					client.anInt7294 = i_2;
					client.anInt7296 = 2;
					client.anInt7295 = 0;
					TCPPacket tcpmessage_15 = TCPPacket.createPacket(action.toPacket(), client.GAME_CONNECTION_CONTEXT.outKeys);
					tcpmessage_15.buffer.writeShort(targetKey);
					tcpmessage_15.buffer.writeByte(VertexNormal.method1465() ? 1 : 0);
					client.GAME_CONNECTION_CONTEXT.queuePacket(tcpmessage_15);
					MapRegion.routeTo(npc_14.regionBaseX[0], npc_14.regionBaseY[0], true, Class344.method6115(npc_14.regionBaseX[0], npc_14.regionBaseY[0], npc_14.getSize(), npc_14.getSize()));
				}
			}
			
			case OP_OBJ1, OP_OBJ2, OP_OBJ3, 
				 OP_OBJ4, OP_OBJ5, OP_OBJ6 -> {
				client.anInt7293 = i_1;
				client.anInt7294 = i_2;
				client.anInt7296 = 2;
				client.anInt7295 = 0;
				TCPPacket tcpmessage_15 = TCPPacket.createPacket(action.toPacket(), client.GAME_CONNECTION_CONTEXT.outKeys);
				tcpmessage_15.buffer.writeShort(i_5 + mapBase.y);
				tcpmessage_15.buffer.writeShort(i_4 + mapBase.x);
				tcpmessage_15.buffer.writeInt((int) (long_8 >>> 32) & 0x7fffffff);
				tcpmessage_15.buffer.writeByte128(VertexNormal.method1465() ? 1 : 0);
				client.GAME_CONNECTION_CONTEXT.queuePacket(tcpmessage_15);
				Class439.routeToSceneObject(i_4, i_5, long_8);
			}
			
			case TGT_NPC -> {
				ObjectNode class282_sub47_24 = (ObjectNode) client.NPC_MAP.get(targetKey);
				if (class282_sub47_24 != null) {
					NPCEntity npc_25 = (NPCEntity) class282_sub47_24.anObject8068;
					client.anInt7293 = i_1;
					client.anInt7294 = i_2;
					client.anInt7296 = 2;
					client.anInt7295 = 0;
					TCPPacket tcpmessage_16 = TCPPacket.createPacket(ClientProt.IF_ON_NPC, client.GAME_CONNECTION_CONTEXT.outKeys);
					tcpmessage_16.buffer.writeIntV2(client.anInt56);
					tcpmessage_16.buffer.writeShortLE128(targetKey);
					tcpmessage_16.buffer.write128Byte(VertexNormal.method1465() ? 1 : 0);
					tcpmessage_16.buffer.writeShortLE128(client.anInt7346);
					tcpmessage_16.buffer.writeShort128(client.anInt7345);
					client.GAME_CONNECTION_CONTEXT.queuePacket(tcpmessage_16);
					MapRegion.routeTo(npc_25.regionBaseX[0], npc_25.regionBaseY[0], true, Class344.method6115(npc_25.regionBaseX[0], npc_25.regionBaseY[0], npc_25.getSize(), npc_25.getSize()));
				}
			}
			
			case IF_BUTTONX1, IF_BUTTONX2 -> CutsceneAction_Sub10.method14603(targetKey, i_5, i_4, event.aString9588);
			
			case OP_MAPELEMENT1, OP_MAPELEMENT2, OP_MAPELEMENT3, OP_MAPELEMENT4, OP_MAPELEMENT5 -> Friend.method303(action, targetKey, i_4);
			
			case TGT_BUTTON -> {
				IComponentDefinitions icomponentdefinitions_23 = Index.getIComponentDefinitions(i_5, i_4);
				if (icomponentdefinitions_23 != null)
					Class151.method2590(icomponentdefinitions_23);
			}
			
			case SELECT_TGT -> {
				IComponentDefinitions icomponentdefinitions_23 = Index.getIComponentDefinitions(i_5, i_4);
				if (icomponentdefinitions_23 != null) {
					Class60.method1170();
					IFEvents class282_sub10_21 = client.getIComponentSettings(icomponentdefinitions_23);
					Class304.setUseOptionFlags(icomponentdefinitions_23, class282_sub10_21.getUseOptionFlags(), class282_sub10_21.targetParam);
					client.aString7275 = QuickChatMessage.method6157(icomponentdefinitions_23);
					if (client.aString7275 == null)
						client.aString7275 = "Null";

					client.aString7356 = icomponentdefinitions_23.useOnName + Utils.rgbToColHexShortcut(16777215);
				}
				return;
			}
			
			case IF_CONTINUE -> {
				Class158_Sub2.method14355(i_5, i_4);
				client.aClass118_7352 = Index.getIComponentDefinitions(i_5, i_4);
				if (client.aClass118_7352 != null)
					IComponentDefinitions.redrawComponent(client.aClass118_7352);
			}
			
			case FACE_SQUARE -> {
				if (client.PLAYER_RIGHTS > 0 && PlaySoundVorbisCutsceneAction.method14577())
					VarnIndexLoader.method7460(VertexNormal.MY_PLAYER.plane, i_4 + mapBase.x, i_5 + mapBase.y);
				else {
					client.anInt7293 = i_1;
					client.anInt7294 = i_2;
					client.anInt7296 = 1;
					client.anInt7295 = 0;
					TCPPacket tcpmessage_13 = TCPPacket.createPacket(ClientProt.FACE_SQUARE, client.GAME_CONNECTION_CONTEXT.outKeys);
					tcpmessage_13.buffer.writeShort128(i_4 + mapBase.x);
					tcpmessage_13.buffer.writeShort(i_5 + mapBase.y);
					client.GAME_CONNECTION_CONTEXT.queuePacket(tcpmessage_13);
				}
			}
			
			case WALK -> {
				if (client.PLAYER_RIGHTS > 0 && PlaySoundVorbisCutsceneAction.method14577())
					VarnIndexLoader.method7460(VertexNormal.MY_PLAYER.plane, i_4 + mapBase.x, i_5 + mapBase.y);
				else {
					TCPPacket tcpmessage_13 = CutsceneArea.method12078(i_4, i_5, targetKey);
					if (targetKey == 1) {
						tcpmessage_13.buffer.writeByte(-1);
						tcpmessage_13.buffer.writeByte(-1);
						tcpmessage_13.buffer.writeShort((int) Camera.camAngleY);
						tcpmessage_13.buffer.writeByte(57);
						tcpmessage_13.buffer.writeByte(client.anInt7255);
						tcpmessage_13.buffer.writeByte(client.anInt7203);
						tcpmessage_13.buffer.writeByte(89);
						Vector3 vector3_20 = VertexNormal.MY_PLAYER.method11166().coords;
						tcpmessage_13.buffer.writeShort((int) vector3_20.x);
						tcpmessage_13.buffer.writeShort((int) vector3_20.z);
						tcpmessage_13.buffer.writeByte(63);
					} else {
						client.anInt7293 = i_1;
						client.anInt7294 = i_2;
						client.anInt7296 = 1;
						client.anInt7295 = 0;
					}

					client.GAME_CONNECTION_CONTEXT.queuePacket(tcpmessage_13);
					MapRegion.routeTo(i_4, i_5, true, SunDefinitions.method853(i_4, i_5));
				}
			}
			default -> {}
			}
			if (client.IS_USE_SELECTED)
				Class60.method1170();
			if (VarcStringIndexLoader.aClass118_4825 != null && client.anInt7297 == 0)
				IComponentDefinitions.redrawComponent(VarcStringIndexLoader.aClass118_4825);
		}
	}
	int anInt8520;
	int anInt8519;
	int anInt8521;

	int anInt8522;

	int anInt8523;

	CutsceneAction_Sub4(ByteBuf rsbytebuffer_1) {
		super(rsbytebuffer_1);
		anInt8520 = rsbytebuffer_1.readUnsignedShort();
		int i_2 = rsbytebuffer_1.readInt();
		anInt8519 = i_2 >>> 16;
		anInt8521 = i_2 & 0xffff;
		anInt8522 = rsbytebuffer_1.readUnsignedByte();
		anInt8523 = rsbytebuffer_1.readUnsignedSmart();
	}

	@Override
	public void method1592() {
		Class82.CUTSCENE_ENTITIES[anInt8520].move(anInt8519, anInt8521, anInt8522, anInt8523);
	}

	public void method1601() {
		Class82.CUTSCENE_ENTITIES[anInt8520 * 2062001331 * 2144840315].move(1910720287 * anInt8519 * 517305567, anInt8521 * -1845072575 * -194698559, 1760322517 * anInt8522 * 1440988541, 1015183835 * anInt8523 * 1479203411);
	}
}
