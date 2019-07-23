public enum OutgoingPacket {
	PING(0, 0),
	PLAYER_OP6(1, 3, true),
	SOUND_EFFECT_MUSIC_ENDED(2, 4),
	NPC_EXAMINE(3, 3),
	IF_ON_IF(4, 16, true),
	WORLD_MAP_CLICK(5, 4),
	PLAYER_OP2(6, 3, true),
	SET_FC_RANK(7, -1),
	GROUND_ITEM_OP4(8, 7, true),
	IF_OP4(9, 8, true),
	SEND_PREFERENCES(10, -1),
	RESUME_HSLDIALOG(11, 2),
	REMOVE_IGNORE(12, -1),
	IF_ON_PLAYER(13, 11, true),
	SEND_FRIENDS_QUICKCHAT(14, -1),
	SEND_FRIENDS_CHAT_MESSAGE(15, -2),
	NPC_OP2(16, 3, true),
	GRAND_EXCHANGE_ITEM_SELECT(17, 2),
	UNK_18(18, 4), //music related
	IF_OP6(19, 8, true),
	CHAT_SETFILTER(20, 3),
	IF_OP8(21, 8, true),
	IF_OP9(22, 8, true),
	IF_OP7(23, 8, true),
	GROUND_ITEM_OP1(24, 7, true),
	GROUND_ITEM_OP2(25, 7, true),
	ADD_FRIEND(26, -1),
	IF_OP2(27, 8, true),
	KEY_PRESS(28, -2),
	REMOVE_FRIEND(29, -1),
	CHAT_TYPE(30, 1),
	PLAYER_OP3(31, 3, true),
	OBJECT_OP4(32, 9, true),
	WALK(33, 5, true),
	ADD_IGNORE(34, -1),
	BUG_REPORT(35, -2),
	REFLECTION_CHECK(36, -1),
	UNK_37(37, 2), //index 36 and some hook/click type related
	OBJECT_OP3(38, 9, true),
	CLAN_CHAT_KICK(39, -1),
	MOVE_MOUSE(40, -1),
	IF_ON_NPC(41, 11, true),
	MINI_WALK(42, 18, true),
	GROUND_ITEM_OP5(43, 7, true),
	SEND_FPS(44, 9),
	CUTSCENE_FINISHED(45, 1),
	IF_ON_TILE(46, 12, true),
	REQUEST_WORLD_LIST(47, 4),
	OBJECT_OP5(48, 9, true),
	IF_CONTINUE(49, 6, true),
	NPC_OP3(50, 3, true),
	PLAYER_OP7(51, 3, true),
	EMAIL_VALIDATION_SUBMIT_CODE(52, -1),
	PLAYER_OP9(53, 3, true),
	GROUND_ITEM_OP3(54, 7, true),
	RECEIVE_PACKET_COUNT(55, 4),
	LOBBY_HYPERLINK(56, -2), //clicking hyperlink in lobby
	MOUSE_BUTTON_CLICK(57, 7),
	RESUME_COUNTDIALOG(58, 4),
	CLICK(59, 6),
	CLOSE_INTERFACE(60, 0),
	GROUND_ITEM_EXAMINE(61, 7),
	CLIENT_FOCUS(62, 1),
	UNK_63(63, 4), //near where shift click teleporting so some kind of map click probably?
	PUBLIC_QUICKCHAT(64, -1),
	NPC_OP1(65, 3, true),
	PLAYER_OP1(66, 3, true),
	IF_ON_GROUND_ITEM(67, 15, true),
	IF_OP3(68, 8, true),
	RESUME_CLANFORUMQFCDIALOG(69, -1),
	PLAYER_OP10(70, 3, true),
	JOIN_FRIENDS_CHAT(71, -1),
	IF_OP5(72, 8, true),
	OBJECT_EXAMINE(73, 9),
	IF_DRAG_ONTO_IF(74, 16, true),
	OBJECT_OP1(75, 9, true),
	REGION_LOADED_CONFIRM(76, 0),
	NPC_OP4(77, 3, true),
	MOVE_MOUSE_2(78, -1),
	UNK_79(79, 1), //TODO account creation related
	RESUME_NAMEDIALOG(80, -1),
	IF_OP10(81, 8, true),
	UNK_82(82, 4), //writes one identical int sometime during gamestate/region loading. Probably sends when something fails to load or error occurs
	MOVE_CAMERA(83, 4),
	SCREEN_SIZE(84, 6),
	COMMAND(85, -1),
	CHAT(86, -1),
	RESUME_TEXTDIALOG(87, -1),
	WRITE_PING(88, 2),
	PLAYER_OP4(89, 3, true),
	UNK_90(90, -1), //TODO another clan user click one
	KICK_FRIENDS_CHAT(91, -1),
	EMAIL_VALIDATION_ADD_NEW_ADDRESS(92, -2),
	OBJECT_OP2(93, 9, true),
	PLAYER_OP8(94, 3, true),
	NPC_OP5(95, 3, true),
	IF_OP1(96, 8, true),
	UNK_97(97, -1), //cs2 driven something during login stage?
	IF_ON_OBJECT(98, 17, true),
	EMAIL_VALIDATION_CHANGE_ADDRESS(99, -2),
	REPORT_ABUSE(100, -1),
	SEND_SIGN_UP_FORM(101, -2),
	CHECK_EMAIL_VALIDITY(102, -2),
	PLAYER_OP5(103, 3, true);

	int id;
	int size;
	boolean tickProcessed;

	OutgoingPacket(int id, int size, boolean tickProcessed) {
		this.id = id;
		this.size = size;
		this.tickProcessed = tickProcessed;
	}
	
	OutgoingPacket(int id, int size) {
		this(id, size, false);
	}
}
