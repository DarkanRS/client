// This program is free software: you can redistribute it and/or modify
// it under the terms of the GNU General Public License as published by
// the Free Software Foundation, either version 3 of the License, or
// (at your option) any later version.
// 
// This program is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// GNU General Public License for more details.
// 
// You should have received a copy of the GNU General Public License
// along with this program.  If not, see <http://www.gnu.org/licenses/>.
//
//  Copyright © 2021 Trenton Kress
//  This file is part of project: Darkan
//
package com.jagex;

import java.util.HashMap;
import java.util.Map;

public enum MessageType {
	UNFILTERABLE(0),
	STAFF_CHAT(1),
	PUBLIC_CHAT(2),
	PRIVATE_MESSAGE_ECHO(3),
	GAME(4),
	FRIENDS_STATUS(5),
	PRIVATE_MESSAGE(6),
	PRIVATE_STAFF(7),
	UNK_8(8),
	FC_CHAT(9),
	UNK_10(10),
	FC_NOTIFICATION(11),
	UNK_12(12),
	UNK_13(13),
	UNK_14(14),
	UNK_15(15),
	UNK_16(16),
	PUBLIC_QUICKCHAT(17),
	PRIVATE_QUICKCHAT_ECHO(18),
	PRIVATE_QUICKCHAT(19),
	FC_QUICKCHAT(20),
	UNK_21(21),
	UNK_22(22),
	UNK_23(23),
	GROUP_CHAT(24),
	GROUP_QUICKCHAT(25),
	UNK_26(26),
	ITEM_EXAMINE(27),
	NPC_EXAMINE(28),
	OBJECT_EXAMINE(29),
	FRIEND_NOTIFICATION(30),
	IGNORE_NOTIFICATION(31),
	UNK_32(32),
	UNK_33(33),
	UNK_34(34),
	UNK_35(35),
	UNK_36(36),
	UNK_37(37),
	UNK_38(38),
	UNK_39(39),
	UNK_40(40),
	CLAN_CHAT(41),
	CLAN_QUICKCHAT(42),
	CLAN_NOTIFICATION(43),
	GUEST_CLAN_CHAT(44),
	GUEST_CLAN_QUICKCHAT(45),
	UNK_46(46),
	UNK_47(47),
	UNK_48(48),
	UNK_49(49),
	UNK_50(50),
	UNK_51(51),
	UNK_52(52),
	UNK_53(53),
	UNK_54(54),
	UNK_55(55),
	UNK_56(56),
	UNK_57(57),
	UNK_58(58),
	UNK_59(59),
	UNK_60(60),
	UNK_61(61),
	UNK_62(62),
	UNK_63(63),
	UNK_64(64),
	UNK_65(65),
	UNK_66(66),
	UNK_67(67),
	UNK_68(68),
	UNK_69(69),
	UNK_70(70),
	UNK_71(71),
	UNK_72(72),
	UNK_73(73),
	UNK_74(74),
	UNK_75(75),
	UNK_76(76),
	UNK_77(77),
	UNK_78(78),
	UNK_79(79),
	UNK_80(80),
	UNK_81(81),
	UNK_82(82),
	UNK_83(83),
	UNK_84(84),
	UNK_85(85),
	UNK_86(86),
	UNK_87(87),
	UNK_88(88),
	UNK_89(89),
	UNK_90(90),
	UNK_91(91),
	UNK_92(92),
	UNK_93(93),
	UNK_94(94),
	UNK_95(95),
	UNK_96(96),
	UNK_97(97),
	DEV_CONSOLE_CLEAR(98),
	DEV_CONSOLE(99),
	TRADE_REQUEST(100),
	DUEL_REQUEST(101),
	ASSIST_REQUEST(102),
	UNK_103(103),
	UNK_104(104),
	UNK_CHALLENGE_105(105),
	UNK_CHALLENGE_106(106),
	UNK_CHALLENGE_107(107),
	ALLIANCE_REQUEST(108),
	FILTERABLE(109),
	UNK_GAME_110(110),
	DUNGEONEERING_INVITE(111),
	VOTE_REQUEST(112),
	UNK_CHALLENGE_113(113),
	UNK_CHALLENGE_114(114),
	UNK_DARK_RED_115(115),
	UNK_PLAIN_NOTIFICATION_116(116),
	CLAN_INVITE(117),
	CLAN_CHALLENGE_REQUEST(118),
	UNK_119(119),
	UNK_120(120),
	UNK_121(121);
	
	private static Map<Integer, MessageType> MAP = new HashMap<>();
	
	static {
		for (MessageType t : MessageType.values())
			MAP.put(t.value, t);
	}
	
	public static MessageType forId(int id) {
		MessageType type = MAP.get(id);
		return type != null ? type : MessageType.GAME;
	}
	
	private int value;
	
	private MessageType(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
}
