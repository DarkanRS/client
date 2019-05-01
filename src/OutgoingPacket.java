

public class OutgoingPacket {
	public static OutgoingPacket PING = new OutgoingPacket(0, 0);
	public static OutgoingPacket PLAYER_OPTION_6 = new OutgoingPacket(1, 3);
	public static OutgoingPacket SOUND_EFFECT_MUSIC_ENDED = new OutgoingPacket(2, 4);
	public static OutgoingPacket NPC_EXAMINE = new OutgoingPacket(3, 3);
	public static OutgoingPacket ICOMPONENT_ON_ICOMPONENT = new OutgoingPacket(4, 16);
	public static OutgoingPacket WORLD_MAP_CLICK = new OutgoingPacket(5, 4);
	public static OutgoingPacket PLAYER_OPTION_2 = new OutgoingPacket(6, 3);
	public static OutgoingPacket CHANGE_FRIENDS_CHAT = new OutgoingPacket(7, -1);
	public static OutgoingPacket GROUND_ITEM_CLICK_4 = new OutgoingPacket(8, 7);
	public static OutgoingPacket BUTTON_CLICK_4 = new OutgoingPacket(9, 8);
	public static OutgoingPacket SEND_PREFERENCES = new OutgoingPacket(10, -1);
	public static OutgoingPacket RESUME_HSLDIALOG = new OutgoingPacket(11, 2);
	public static OutgoingPacket REMOVE_IGNORE = new OutgoingPacket(12, -1);
	public static OutgoingPacket ICOMPONENT_ON_PLAYER = new OutgoingPacket(13, 11);
	public static OutgoingPacket SEND_FRIENDS_QUICKCHAT = new OutgoingPacket(14, -1);
	public static OutgoingPacket SEND_FRIENDS_CHAT_MESSAGE = new OutgoingPacket(15, -2);
	public static OutgoingPacket NPC_ATTACK = new OutgoingPacket(16, 3);
	public static OutgoingPacket GRAND_EXCHANGE_ITEM_SELECT = new OutgoingPacket(17, 2);
	public static OutgoingPacket aClass379_4531 = new OutgoingPacket(18, 4); //music related
	public static OutgoingPacket BUTTON_CLICK_9 = new OutgoingPacket(19, 8);
	public static OutgoingPacket CHAT_SETFILTER = new OutgoingPacket(20, 3);
	public static OutgoingPacket BUTTON_CLICK_7 = new OutgoingPacket(21, 8);
	public static OutgoingPacket BUTTON_CLICK_10 = new OutgoingPacket(22, 8);
	public static OutgoingPacket BUTTON_CLICK_6 = new OutgoingPacket(23, 8);
	public static OutgoingPacket GROUND_ITEM_CLICK_1 = new OutgoingPacket(24, 7);
	public static OutgoingPacket GROUND_ITEM_CLICK_2 = new OutgoingPacket(25, 7);
	public static OutgoingPacket ADD_FRIEND = new OutgoingPacket(26, -1);
	public static OutgoingPacket BUTTON_CLICK_2 = new OutgoingPacket(27, 8);
	public static OutgoingPacket KEY_PRESS = new OutgoingPacket(28, -2);
	public static OutgoingPacket REMOVE_FRIEND = new OutgoingPacket(29, -1);
	public static OutgoingPacket CHAT_TYPE = new OutgoingPacket(30, 1);
	public static OutgoingPacket PLAYER_OPTION_3 = new OutgoingPacket(31, 3);
	public static OutgoingPacket OBJECT_CLICK_4 = new OutgoingPacket(32, 9);
	public static OutgoingPacket WALK = new OutgoingPacket(33, 5);
	public static OutgoingPacket ADD_IGNORE = new OutgoingPacket(34, -1);
	public static OutgoingPacket aClass379_4533 = new OutgoingPacket(35, -2); //cs2 script driven 2 strings
	public static OutgoingPacket REFLECTION_CHECK = new OutgoingPacket(36, -1);
	public static OutgoingPacket aClass379_4556 = new OutgoingPacket(37, 2); //index 36 and some hook/click type related
	public static OutgoingPacket OBJECT_CLICK_3 = new OutgoingPacket(38, 9);
	public static OutgoingPacket CLAN_CHAT_KICK = new OutgoingPacket(39, -1);
	public static OutgoingPacket MOVE_MOUSE = new OutgoingPacket(40, -1);
	public static OutgoingPacket ICOMPONENT_ON_NPC = new OutgoingPacket(41, 11);
	public static OutgoingPacket MINI_WALK = new OutgoingPacket(42, 18);
	public static OutgoingPacket GROUND_ITEM_CLICK_5 = new OutgoingPacket(43, 7);
	public static OutgoingPacket SEND_FPS = new OutgoingPacket(44, 9);
	public static OutgoingPacket aClass379_4572 = new OutgoingPacket(45, 1); //cutscene related
	public static OutgoingPacket ICOMPONENT_ON_TILE = new OutgoingPacket(46, 12);
	public static OutgoingPacket REQUEST_WORLD_LIST = new OutgoingPacket(47, 4);
	public static OutgoingPacket OBJECT_CLICK_5 = new OutgoingPacket(48, 9);
	public static OutgoingPacket ICOMPONENT_CONTINUE = new OutgoingPacket(49, 6);
	public static OutgoingPacket NPC_CLICK_2 = new OutgoingPacket(50, 3);
	public static OutgoingPacket PLAYER_OPTION_7 = new OutgoingPacket(51, 3);
	public static OutgoingPacket EMAIL_VALIDATION_SUBMIT_CODE = new OutgoingPacket(52, -1);
	public static OutgoingPacket PLAYER_OPTION_9 = new OutgoingPacket(53, 3);
	public static OutgoingPacket GROUND_ITEM_CLICK_3 = new OutgoingPacket(54, 7);
	public static OutgoingPacket RECEIVE_PACKET_COUNT = new OutgoingPacket(55, 4);
	public static OutgoingPacket aClass379_4543 = new OutgoingPacket(56, -2);
	public static OutgoingPacket MOUSE_BUTTON_CLICK = new OutgoingPacket(57, 7);
	public static OutgoingPacket RESUME_COUNTDIALOG = new OutgoingPacket(58, 4);
	public static OutgoingPacket CLICK = new OutgoingPacket(59, 6);
	public static OutgoingPacket CLOSE_INTERFACE = new OutgoingPacket(60, 0);
	public static OutgoingPacket GROUND_ITEM_EXAMINE = new OutgoingPacket(61, 7);
	public static OutgoingPacket CLIENT_FOCUS = new OutgoingPacket(62, 1);
	public static OutgoingPacket aClass379_4590 = new OutgoingPacket(63, 4); //near where shift click teleporting so some kind of map click probably?
	public static OutgoingPacket PUBLIC_QUICKCHAT = new OutgoingPacket(64, -1);
	public static OutgoingPacket NPC_CLICK_1 = new OutgoingPacket(65, 3);
	public static OutgoingPacket PLAYER_OPTION_1 = new OutgoingPacket(66, 3);
	public static OutgoingPacket ICOMPONENT_ON_GROUND_ITEM = new OutgoingPacket(67, 15);
	public static OutgoingPacket BUTTON_CLICK_3 = new OutgoingPacket(68, 8);
	public static OutgoingPacket RESUME_CLANFORUMQFCDIALOG = new OutgoingPacket(69, -1);
	public static OutgoingPacket PLAYER_OPTION_10 = new OutgoingPacket(70, 3);
	public static OutgoingPacket JOIN_FRIENDS_CHAT = new OutgoingPacket(71, -1);
	public static OutgoingPacket BUTTON_CLICK_5 = new OutgoingPacket(72, 8);
	public static OutgoingPacket OBJECT_EXAMINE = new OutgoingPacket(73, 9);
	public static OutgoingPacket ICOMPONENT_DRAG_ONTO_ICOMPONENT = new OutgoingPacket(74, 16);
	public static OutgoingPacket OBJECT_CLICK_1 = new OutgoingPacket(75, 9);
	public static OutgoingPacket REGION_LOADED_CONFIRM = new OutgoingPacket(76, 0);
	public static OutgoingPacket NPC_CLICK_3 = new OutgoingPacket(77, 3);
	public static OutgoingPacket MOVE_MOUSE_2 = new OutgoingPacket(78, -1);
	public static OutgoingPacket aClass379_4606 = new OutgoingPacket(79, 1); //TODO account creation related
	public static OutgoingPacket RESUME_NAMEDIALOG = new OutgoingPacket(80, -1);
	public static OutgoingPacket BUTTON_CLICK_8 = new OutgoingPacket(81, 8);
	public static OutgoingPacket aClass379_4609 = new OutgoingPacket(82, 4); //writes one identical int sometime during gamestate/region loading. Probably sends when something fails to load or error occurs
	public static OutgoingPacket MOVE_CAMERA = new OutgoingPacket(83, 4);
	public static OutgoingPacket SCREEN_SIZE = new OutgoingPacket(84, 6);
	public static OutgoingPacket COMMAND = new OutgoingPacket(85, -1);
	public static OutgoingPacket CHAT = new OutgoingPacket(86, -1);
	public static OutgoingPacket RESUME_TEXTDIALOG = new OutgoingPacket(87, -1);
	public static OutgoingPacket WRITE_PING = new OutgoingPacket(88, 2);
	public static OutgoingPacket PLAYER_OPTION_4 = new OutgoingPacket(89, 3);
	public static OutgoingPacket aClass379_4617 = new OutgoingPacket(90, -1); //TODO another clan user click one
	public static OutgoingPacket KICK_FRIENDS_CHAT = new OutgoingPacket(91, -1);
	public static OutgoingPacket EMAIL_VALIDATION_ADD_NEW_ADDRESS = new OutgoingPacket(92, -2);
	public static OutgoingPacket OBJECT_CLICK_2 = new OutgoingPacket(93, 9);
	public static OutgoingPacket PLAYER_OPTION_8 = new OutgoingPacket(94, 3);
	public static OutgoingPacket NPC_CLICK_4 = new OutgoingPacket(95, 3);
	public static OutgoingPacket BUTTON_CLICK_1 = new OutgoingPacket(96, 8);
	public static OutgoingPacket aClass379_4624 = new OutgoingPacket(97, -1); //cs2 driven something during login stage?
	public static OutgoingPacket ICOMPONENT_ON_OBJECT = new OutgoingPacket(98, 17);
	public static OutgoingPacket EMAIL_VALIDATION_CHANGE_ADDRESS = new OutgoingPacket(99, -2);
	public static OutgoingPacket REPORT_ABUSE = new OutgoingPacket(100, -1);
	public static OutgoingPacket SEND_SIGN_UP_FORM = new OutgoingPacket(101, -2);
	public static OutgoingPacket CHECK_EMAIL_VALIDITY = new OutgoingPacket(102, -2);
	public static OutgoingPacket PLAYER_OPTION_5 = new OutgoingPacket(103, 3);

	int anInt4631;

	int anInt4632;

	OutgoingPacket(int i_1, int i_2) {
		this.anInt4631 = i_1;
		this.anInt4632 = i_2;
	}
}
