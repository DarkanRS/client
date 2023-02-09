package com.rs.jagex;

import java.util.HashMap;
import java.util.Map;

public enum MenuAction {
//	2 = TGT_OBJ
	TGT_OBJ(2),
//	3 = OP_OBJ1
	OP_OBJ1(3),
//	4 = OP_OBJ2
	OP_OBJ2(4),
//	5 = OP_OBJ3
	OP_OBJ3(5),
//	6 = OP_OBJ4
	OP_OBJ4(6),
//	8 = TGT_NPC
	TGT_NPC(8),
//	9 = OP_NPC1
	OP_NPC1(9),
//	10 = OP_NPC2
	OP_NPC2(10),
//	11 = OP_NPC3
	OP_NPC3(11),
//	12 = OP_NPC4
	OP_NPC4(12),
//	13 = OP_NPC5
	OP_NPC5(13),
//	15 = TGT_PLAYER
	TGT_PLAYER(15),
//	16 = TGT_SELF
	TGT_SELF(16),
//	17 = TGT_GROUND_ITEM
	TGT_GROUND_ITEM(17),
//	18 = OP_GROUND_ITEM1
	OP_GROUND_ITEM1(18),
//	19 = OP_GROUND_ITEM2
	OP_GROUND_ITEM2(19),
//	20 = OP_GROUND_ITEM3
	OP_GROUND_ITEM3(20),
//	21 = OP_GROUND_ITEM4
	OP_GROUND_ITEM4(21),
//	22 = OP_GROUND_ITEM5
	OP_GROUND_ITEM5(22),
//	23 = WALK
	WALK(23),
//	25 = TGT_BUTTON
	SELECT_TGT(25),
//	30 = PAUSE_BUTTON
	IF_CONTINUE(30),
//	44 = OP_PLAYER1
	OP_PLAYER1(44),
//	45 = OP_PLAYER2
	OP_PLAYER2(45),
//	46 = OP_PLAYER3
	OP_PLAYER3(46),
//	47 = OP_PLAYER4
	OP_PLAYER4(47),
//	48 = OP_PLAYER5
	OP_PLAYER5(48),
//	49 = OP_PLAYER6
	OP_PLAYER6(49),
//	50 = OP_PLAYER7
	OP_PLAYER7(50),
//	51 = OP_PLAYER8
	OP_PLAYER8(51),
//	52 = OP_PLAYER9
	OP_PLAYER9(52),
//	53 = OP_PLAYER10
	OP_PLAYER10(53),
//	57 = IF_BUTTONX1
	IF_BUTTONX1(57),
//	58 = IF_BUTTONT
	TGT_BUTTON(58),
//	59 = TGT_GROUND
	TGT_GROUND(59),
//	60 = FACE_SQUARE
	FACE_SQUARE(60),
//	1001 = OP_OBJ5
	OP_OBJ5(1001),
//	1002 = OP_OBJ6
	OP_OBJ6(1002),
//	1003 = OP_NPC6
	OP_NPC6(1003),
//	1004 = OP_GROUND_ITEM6
	OP_GROUND_ITEM6(1004),
//	1006 = CANCEL
	CANCEL(1006),
//	1007 = IF_BUTTONX2
	IF_BUTTONX2(1007),
//	1008 = OP_MAPELEMENT1
	OP_MAPELEMENT1(1008),
//	1009 = OP_MAPELEMENT2
	OP_MAPELEMENT2(1009),
//	1010 = OP_MAPELEMENT3
	OP_MAPELEMENT3(1010),
//	1011 = OP_MAPELEMENT4
	OP_MAPELEMENT4(1011),
//	1012 = OP_MAPELEMENT5
	OP_MAPELEMENT5(1012),
//	2009 = OP_NPC1_LOWPRIORITY
	OP_NPC1_LOWPRIORITY(2009),
//	2010 = OP_NPC2_LOWPRIORITY
	OP_NPC2_LOWPRIORITY(2010),
//	2011 = OP_NPC3_LOWPRIORITY
	OP_NPC3_LOWPRIORITY(2011),
//	2012 = OP_NPC4_LOWPRIORITY
	OP_NPC4_LOWPRIORITY(2012),
//	2013 = OP_NPC5_LOWPRIORITY
	OP_NPC5_LOWPRIORITY(2013),
//	3003 = OP_NPC6_LOWPRIORITY
	OP_NPC6_LOWPRIORITY(3003),
//	2044 = OP_PLAYER1_LOWPRIORITY
	OP_PLAYER1_LOWPRIORITY(2044),
//	2045 = OP_PLAYER2_LOWPRIORITY
	OP_PLAYER2_LOWPRIORITY(2045),
//	2046 = OP_PLAYER3_LOWPRIORITY
	OP_PLAYER3_LOWPRIORITY(2046),
//	2047 = OP_PLAYER4_LOWPRIORITY
	OP_PLAYER4_LOWPRIORITY(2047),
//	2048 = OP_PLAYER5_LOWPRIORITY
	OP_PLAYER5_LOWPRIORITY(2048),
//	2049 = OP_PLAYER6_LOWPRIORITY
	OP_PLAYER6_LOWPRIORITY(2049),
//	2050 = OP_PLAYER7_LOWPRIORITY
	OP_PLAYER7_LOWPRIORITY(2050),
//	2051 = OP_PLAYER8_LOWPRIORITY
	OP_PLAYER8_LOWPRIORITY(2051),
//	2052 = OP_PLAYER9_LOWPRIORITY
	OP_PLAYER9_LOWPRIORITY(2052),
//	2053 = OP_PLAYER10_LOWPRIORITY
	OP_PLAYER10_LOWPRIORITY(2053);
	
	static Map<Integer, MenuAction> MAP = new HashMap<>();
	
	static {
		for (MenuAction a : MenuAction.values())
			MAP.put(a.id, a);
	}
	
	static MenuAction forId(int id) {
		return MAP.get(id);
	}
	
	private int id;
	
	MenuAction(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}

	MenuAction removeLowPriority() {
		return switch(this) {
		case OP_NPC1_LOWPRIORITY -> MenuAction.OP_NPC1;
		case OP_NPC2_LOWPRIORITY -> MenuAction.OP_NPC2;
		case OP_NPC3_LOWPRIORITY -> MenuAction.OP_NPC3;
		case OP_NPC4_LOWPRIORITY -> MenuAction.OP_NPC4;
		case OP_NPC5_LOWPRIORITY -> MenuAction.OP_NPC5;
		case OP_NPC6_LOWPRIORITY -> MenuAction.OP_NPC6;
		case OP_PLAYER1_LOWPRIORITY -> MenuAction.OP_PLAYER1;
		case OP_PLAYER2_LOWPRIORITY -> MenuAction.OP_PLAYER2;
		case OP_PLAYER3_LOWPRIORITY -> MenuAction.OP_PLAYER3;
		case OP_PLAYER4_LOWPRIORITY -> MenuAction.OP_PLAYER4;
		case OP_PLAYER5_LOWPRIORITY -> MenuAction.OP_PLAYER5;
		case OP_PLAYER6_LOWPRIORITY -> MenuAction.OP_PLAYER6;
		case OP_PLAYER7_LOWPRIORITY -> MenuAction.OP_PLAYER7;
		case OP_PLAYER8_LOWPRIORITY -> MenuAction.OP_PLAYER8;
		case OP_PLAYER9_LOWPRIORITY -> MenuAction.OP_PLAYER9;
		case OP_PLAYER10_LOWPRIORITY -> MenuAction.OP_PLAYER10;
		default -> this;
		};
	}

	public MenuAction makeLowPriority() {
		return switch(this) {
			case OP_NPC1 -> MenuAction.OP_NPC1_LOWPRIORITY;
			case OP_NPC2 -> MenuAction.OP_NPC2_LOWPRIORITY;
			case OP_NPC3 -> MenuAction.OP_NPC3_LOWPRIORITY;
			case OP_NPC4 -> MenuAction.OP_NPC4_LOWPRIORITY;
			case OP_NPC5 -> MenuAction.OP_NPC5_LOWPRIORITY;
			case OP_NPC6 -> MenuAction.OP_NPC6_LOWPRIORITY;
			case OP_PLAYER1 -> MenuAction.OP_PLAYER1_LOWPRIORITY;
			case OP_PLAYER2 -> MenuAction.OP_PLAYER2_LOWPRIORITY;
			case OP_PLAYER3 -> MenuAction.OP_PLAYER3_LOWPRIORITY;
			case OP_PLAYER4 -> MenuAction.OP_PLAYER4_LOWPRIORITY;
			case OP_PLAYER5 -> MenuAction.OP_PLAYER5_LOWPRIORITY;
			case OP_PLAYER6 -> MenuAction.OP_PLAYER6_LOWPRIORITY;
			case OP_PLAYER7 -> MenuAction.OP_PLAYER7_LOWPRIORITY;
			case OP_PLAYER8 -> MenuAction.OP_PLAYER8_LOWPRIORITY;
			case OP_PLAYER9 -> MenuAction.OP_PLAYER9_LOWPRIORITY;
			case OP_PLAYER10 -> MenuAction.OP_PLAYER10_LOWPRIORITY;
			default -> this;
		};
	}

	ClientProt toPacket() {
		return switch(this) {
		case OP_PLAYER1 -> ClientProt.PLAYER_OP1;
		case OP_PLAYER2 -> ClientProt.PLAYER_OP2;
		case OP_PLAYER3 -> ClientProt.PLAYER_OP3;
		case OP_PLAYER4 -> ClientProt.PLAYER_OP4;
		case OP_PLAYER5 -> ClientProt.PLAYER_OP5;
		case OP_PLAYER6 -> ClientProt.PLAYER_OP6;
		case OP_PLAYER7 -> ClientProt.PLAYER_OP7;
		case OP_PLAYER8 -> ClientProt.PLAYER_OP8;
		case OP_PLAYER9 -> ClientProt.PLAYER_OP9;
		case OP_PLAYER10 -> ClientProt.PLAYER_OP10;
		
		case OP_NPC1 -> ClientProt.NPC_OP1;
		case OP_NPC2 -> ClientProt.NPC_OP2;
		case OP_NPC3 -> ClientProt.NPC_OP3;
		case OP_NPC4 -> ClientProt.NPC_OP4;
		case OP_NPC5 -> ClientProt.NPC_OP5;
		case OP_NPC6 -> ClientProt.NPC_EXAMINE;
		
		case OP_GROUND_ITEM1 -> ClientProt.GROUND_ITEM_OP1;
		case OP_GROUND_ITEM2 -> ClientProt.GROUND_ITEM_OP2;
		case OP_GROUND_ITEM3 -> ClientProt.GROUND_ITEM_OP3;
		case OP_GROUND_ITEM4 -> ClientProt.GROUND_ITEM_OP4;
		case OP_GROUND_ITEM5 -> ClientProt.GROUND_ITEM_OP5;
		case OP_GROUND_ITEM6 -> ClientProt.GROUND_ITEM_EXAMINE;
		
		case OP_OBJ1 -> ClientProt.OBJECT_OP1;
		case OP_OBJ2 -> ClientProt.OBJECT_OP2;
		case OP_OBJ3 -> ClientProt.OBJECT_OP3;
		case OP_OBJ4 -> ClientProt.OBJECT_OP4;
		case OP_OBJ5 -> ClientProt.OBJECT_OP5;
		case OP_OBJ6 -> ClientProt.OBJECT_EXAMINE;
		
		default -> null;
		};
	}
	
	boolean isIFClick() {
		return switch(this) {
		case TGT_BUTTON, IF_BUTTONX1, IF_BUTTONX2, SELECT_TGT, IF_CONTINUE -> true;
		default -> false;
		};
	}
	
	boolean isGroundItemClick() {
		return switch(this) {
		case OP_GROUND_ITEM1, OP_GROUND_ITEM2, OP_GROUND_ITEM3, OP_GROUND_ITEM4, OP_GROUND_ITEM5, OP_GROUND_ITEM6, TGT_GROUND_ITEM -> true;
		default -> false;
		};
	}
	
	boolean isObjectClick() {
		return switch(this) {
		case OP_OBJ1, OP_OBJ2, OP_OBJ3, OP_OBJ4, OP_OBJ5, OP_OBJ6, TGT_OBJ -> true;
		default -> false;
		};
	}
	
	boolean isNPCClick() {
		return switch(this) {
		case OP_NPC1, OP_NPC2, OP_NPC3, OP_NPC4, OP_NPC5, OP_NPC6, TGT_NPC -> true;
		default -> false;
		};
	}
	
	boolean isPlayerClick() {
		return switch(this) {
		case OP_PLAYER1, OP_PLAYER2, OP_PLAYER3, OP_PLAYER4, OP_PLAYER5, OP_PLAYER6, OP_PLAYER7, OP_PLAYER8, OP_PLAYER9, OP_PLAYER10, TGT_PLAYER -> true;
		default -> false;
		};
	}
	
	boolean isTargetOp() {
		return switch(this) {
		case TGT_GROUND, TGT_OBJ, TGT_NPC, TGT_GROUND_ITEM, TGT_PLAYER, TGT_SELF, TGT_BUTTON -> true;
		default -> false;
		};
	}

	//1000 checks should walk or not
	static boolean method5334(MenuAction action1, MenuAction action2) {
		return action2.getId() >= 1000 && action1.getId() < 1000 || (action2.getId() < 1000 && action1.getId() < 1000 ? (action1.isTargetOp() || !action2.isTargetOp()) : action2.getId() >= 1000 && action1.getId() >= 1000);
	}

}
