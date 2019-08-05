import java.util.HashMap;
import java.util.Map;

public enum ServerPacket {
	IF_SETPLAYERHEAD(0, 4),
	CREATE_CHECK_EMAIL_REPLY(1, 1), 
	PROCESS_DEV_CONSOLE_COMMAND(2, -1),
	GROUND_ITEM_COUNT(3, 7),
	UPDATE_INV_PARTIAL(4, -2),
	UPDATE_INV_FULL(5, -2),
	NPC_UPDATE(6, -2),
	IF_SETTEXTFONT(7, 8),
	VARP_LARGE(8, 6),
	LOGOUT_LOBBY(9, 0),
	RECEIVE_PRIVATE_MESSAGE(10, -2),
	aClass375_4362(11, 2), //vorbis preload sound related with sending packet 37 as response
	CLIENT_SETVARC_LARGE(12, 6),
	aClass375_4365(13, 8), //closes and redraws interfaces?
	PLAYER_WEIGHT(14, 2),
	UPDATE_ZONE_PARTIAL_FOLLOWS(15, 3),
	OPEN_URL(16, -2),
	aClass375_4368(17, 3), //vorbis preload sound probably
	VORBIS_SOUND(18, 8),
	UPDATE_FRIENDCHAT_CHANNEL_SINGLEUSER(19, -1),
	aClass375_4402(20, 6), //gets a string from some linkedlist populated from index 36 vorbis??..
	SHOW_FACE_HERE(21, 1),
	MESSAGE_QUICKCHAT_PRIVATE(22, -1),
	IF_OPENSUB_ACTIVE_OBJECT(23, 32),
	CAM_LOOKAT(24, 6),
	RECEIVE_FRIENDS_CHAT_MESSAGE(25, -1),
	VARCLAN_SET_LONG(26, 10),
	CREATE_GROUND_ITEM(27, 5),
	aClass375_4480(28, -2), //clan chat and guest clan chat related
	PING(29, 0),
	CHAT_FILTER_SETTINGS(30, 2),
	MESSAGE_QUICKCHAT_PRIVATE_ECHO(31, -1),
	aClass375_4429(32, 5), //Some login static constant being set?
	IF_SETHIDE(33, 5),
	IF_OPENSUB_ACTIVE_PLAYER(34, 25),
	IF_SETGRAPHIC(35, 8),
	aClass375_4397(36, 5), //redraw interface with boolean?
	IF_OPENTOP(37, 19),
	IF_OPENSUB(38, 23),
	CAM_MOVETO(39, 6),
	aClass375_4399(40, 4), //map region x and y static variables?
	UPDATE_ZONE_FULL_FOLLOWS(41, 3),
	UPDATE_INV_STOP_TRANSMIT(42, 3),
	PLAYER_UPDATE(43, -2),
	IF_SETANGLE(44, 10),
	VARCLAN_ENABLE(45, 0),
	CLANSETTINGS_DELTA(46, -2),
	NPC_UPDATE_LARGE(47, -2),
	IF_SETPOSITION(48, 8),
	CLAN_CHAT_CHANNEL(49, -2),
	SET_CLAN_STRING(50, -1),
	DYNAMIC_MAP_REGION(51, -2),
	aClass375_4499(52, 1), //boolean also set on login?
	IF_SETPLAYERMODEL_OTHER(53, 10),
	CLIENT_SETVARCSTR_SMALL(54, -1),
	IF_SETSCROLLPOS(55, 6),
	PROJANIM_SPECIFIC(56, 22),
	UPDATE_GE_SLOT(57, 20),
	QUICK_HOP_WORLDS(58, -1),
	IF_OPENSUB_ACTIVE_NPC(59, 25),
	MUSIC_EFFECT(60, 6),
	aClass375_4412(61, 1),
	LOGOUT_FULL(62, 0),
	MUSIC_TRACK(63, 4),
	RUN_ENERGY(64, 1),
	UPDATE_ZONE_PARTIAL_ENCLOSED(65, -2),
	CAM_SMOOTHRESET(66, 0),
	CHAT_FILTER_SETTINGS_PRIVATECHAT(67, 1),
	VARBIT_SMALL(68, 3),
	DESTROY_OBJECT(69, 2),
	MINIMAP_FLAG(70, 2),
	CAM_SHAKE(71, 6),
	IF_SETPLAYERMODEL(72, 4),
	aClass375_4396(73, -1), //loops through interface components on an interface setting an int value that only has use in cs2 interpreter? maybe cursor?
	FRIEND_STATUS(74, -2),
	EXECUTE_CS2_SCRIPT_RELATED(75, 4),
	DEBUG_SERVER_TRIGGERS(76, 2),
	PRELOAD_SONG(77, 2),
	IF_CLOSESUB(78, 4),
	HINT_ARROW(79, 14),
	OBJ_ANIM_SPECIFIC(80, 9),
	MESSAGE_CLANCHANNEL(81, -1),
	IF_SETANIM(82, 8),
	QUICKCHAT_RELATED2(83, -1),
	CUSTOMIZE_OBJECT(84, -1),
	REGION(85, -2),
	aClass375_4437(86, -2), //"opensn" maybe social network login?
	CREATE_ACCOUNT_REPLY(87, 1),
	OBJECT_PREFETCH(88, 5),
	CAM_RESET(89, 0),
	aClass375_4441(90, 28), //decoding some stuff into class440? literally not a clue
	UPDATE_SITESETTINGS_COOKIE(91, -1),
	SEND_PRIVATE_MESSAGE(92, -2),
	PLAY_SONG_RELATED(93, 11),
	VARCLAN_DISABLE(94, 0),
	MAP_PROJANIM_HALFSQ(95, 17),
	aClass375_4418(96, 8), //creates a pulse event with type 13 which doesn't have a handler for what I can see? So does nothing effectively?
	IGNORE_LIST(97, -2),
	REFLECTION_CHECK(98, -2),
	RUN_CS2_SCRIPT(99, -2),
	CLEAR_VARPS(100, 0),
	aClass375_4452(101, 0), //something with setting a number to 1 and refreshing interfaces? ignore list related? FRIENDLIST_LOADED?
	UPDATE_REBOOT_TIMER(102, 2),
	WORLD_LIST(103, -2),
	SOUND_IDX15(104, 6),
	IF_SETCOLOUR(105, 6),
	aClass375_4457(106, 2), //vorbis related?
	GROUND_ITEM_REVEAL(107, 7),
	VARBIT_LARGE(108, 6),
	IF_SETNPCHEAD(109, 8),
	CUTSCENE(110, -2),
	PLAYER_OPTION(111, -1),
	IF_SETITEM(112, 10),
	OBJ_ANIM(113, 6),
	TILE_MESSAGE(114, -1),
	VARP_SMALL(115, 3),
	CLIENT_SETVARC_SMALL(116, 3),
	CREATE_OBJECT(117, 6),
	CAM_FORCEANGLE(118, 4),
	CLIENT_SETVARCSTR_LARGE(119, -2),
	RESET_SOUNDS(120, 0),
	IF_SETTARGETPARAM(121, 12),
	RESET_ALL_ANIMATIONS(122, 0),
	VARCLAN_SET_BYTE(123, 3),
	IF_SETTEXT(124, -2),
	REMOVE_GROUND_ITEM(125, 3),
	SPOT_ANIM_SPECIFIC(126, 12),
	FRIENDS_CHAT_CHANNEL(127, -2),
	MIDI_SONG_LOCATION(128, 6),
	aClass375_4364(129, 2), //reads some weird shit and is only set, never read?.. entity method gets set in cs2 interpreter
	IF_SETPLAYERHEAD_IGNOREWORN(130, 10),
	MESSAGE_QUICKCHAT_CLANCHANNEL(131, -1),
	aClass375_4483(132, 9), //retex/recolor interface?
	QUICKCHAT_RELATED1(133, -1),
	aClass375_4453(134, 2), //not a clue
	IF_SETMODEL(135, 8),
	SOUND_SYNTH(136, 8),
	CLANSETTINGS_FULL(137, -2),
	ADD_IGNORE(138, -1),
	SPOT_ANIM(139, 8),
	UPDATE_STAT(140, 6),
	VARCLAN_SET_INT(141, 6),
	MESSAGE_QUICKCHAT_FRIENDCHAT(142, -1),
	MAP_PROJANIM(143, 16),
	aClass375_4495(144, 9), //retex/recolor interface?
	ANIMATE_NPC(145, 19),
	aClass375_4497(146, 0), //load last interface? no idea
	IDENTIFY_HOST_NAME(147, 4),
	IF_RESETTARGETPARAM(148, 10),
	aClass375_5382(149, -2), //rebuild region maybe?
	IF_SETCLICKMASK(150, 5),
	SET_DRAW_ORDER(151, 1),
	PUBLIC_MESSAGE(152, -1),
	SET_CURSOR(153, -1),
	BLOCK_MINIMAP_STATE(154, 1),
	IF_OPENSUB_ACTIVE_GROUNDITEM(155, 29),
	aClass375_4507(156, -2), //calls a javascript method?..
	aClass375_4508(157, 4), //another login static variable set
	IF_SETPLAYERHEAD_OTHER(158, 10),
	REQUEST_FPS(159, 8),
	GAME_MESSAGE(160, -1),
	DISCORD_RICH_PRESENCE_UPDATE(161, -1);

	public int opcode;
	public int size;
	
	private static Map<Integer, ServerPacket> OPCODE_MAP = new HashMap<>();
	
	static {
		for (ServerPacket p : ServerPacket.values())
			OPCODE_MAP.put(p.opcode, p);
	}

	ServerPacket(int opcode, int size) {
		this.opcode = opcode;
		this.size = size;
	}

	public static ServerPacket forId(int opcode) {
		return OPCODE_MAP.get(opcode);
	}
}
