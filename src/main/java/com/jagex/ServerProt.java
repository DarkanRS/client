package com.jagex;

import java.util.HashMap;
import java.util.Map;

public enum ServerProt {
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
    MESSAGE_PRIVATE_ECHO(10, -2),
    aClass375_4362(11, 2), //vorbis preload sound related with sending packet 37 as response
    CLIENT_SETVARC_LARGE(12, 6),
    IF_MOVESUB(13, 8),
    PLAYER_WEIGHT(14, 2),
    UPDATE_ZONE_PARTIAL_FOLLOWS(15, 3),
    OPEN_URL(16, -2),
    aClass375_4368(17, 3), //vorbis preload sound probably
    VORBIS_SOUND(18, 8),
    UPDATE_FRIENDCHAT_CHANNEL_SINGLEUSER(19, -1),
    OUTDATED_SET_THEORA_STRING_SOMETHING(20, 6), //OUTDATED gets a string from some linkedlist populated from index 36 theora?
    SHOW_FACE_HERE(21, 1),
    MESSAGE_QUICKCHAT_PRIVATE(22, -1),
    IF_OPENSUB_ACTIVE_OBJECT(23, 32),
    CAM_LOOKAT(24, 6),
    MESSAGE_FRIENDS_CHAT(25, -1),
    VARCLAN_SET_LONG(26, 10),
    CREATE_GROUND_ITEM(27, 5),
    CLANCHANNEL_DELTA(28, -2),
    KEEPALIVE(29, 0),
    CHAT_FILTER_SETTINGS(30, 2),
    MESSAGE_QUICKCHAT_PRIVATE_ECHO(31, -1),
    LOYALTY_UPDATE(32, 5),
    IF_SETHIDE(33, 5),
    IF_OPENSUB_ACTIVE_NPC(34, 25),
    IF_SETGRAPHIC(35, 8),
    IF_SETTEXTANTIMACRO(36, 5),
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
    CLANCHANNEL_FULL(49, -2),
    SET_CLAN_STRING(50, -1),
    DYNAMIC_MAP_REGION(51, -2),
    DEPRECATED_52_CLIENTPACKET_97(52, 1), //boolean also set on login?
    IF_SETPLAYERMODEL_OTHER(53, 10),
    CLIENT_SETVARCSTR_SMALL(54, -1),
    IF_SETSCROLLPOS(55, 6),
    PROJANIM_SPECIFIC(56, 22),
    UPDATE_GE_SLOT(57, 20),
    QUICK_HOP_WORLDS(58, -1),
    IF_OPENSUB_ACTIVE_PLAYER(59, 25),
    MUSIC_EFFECT(60, 6),
    REDUCE_ATTACK_PRIORITY(61, 1),
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
    DEBUG_SERVER_TRIGGERS(73, -1),
    FRIEND_STATUS(74, -2),
    JCOINS_UPDATE(75, 4),
    APPLY_DEBUG(76, 2),
    PRELOAD_SONG(77, 2),
    IF_CLOSESUB(78, 4),
    HINT_ARROW(79, 14),
    OBJ_ANIM_SPECIFIC(80, 9),
    MESSAGE_CLANCHANNEL(81, -1),
    IF_SETANIM(82, 8),
    MESSAGE_QUICKCHAT_PLAYER_GROUP(83, -1),
    CUSTOMIZE_OBJECT(84, -1),
    REGION(85, -2),
    aClass375_4437(86, -2), //"opensn" maybe social network login?
    CREATE_ACCOUNT_REPLY(87, 1),
    OBJECT_PREFETCH(88, 5),
    CAM_RESET(89, 0),
    UPDATE_UID192(90, 28),
    UPDATE_SITESETTINGS_COOKIE(91, -1),
    SEND_PRIVATE_MESSAGE(92, -2),
    aClass375_3828(93, 11), //play sound song but with specific volume or something?
    VARCLAN_DISABLE(94, 0),
    MAP_PROJANIM_HALFSQ(95, 17),
    DEPRECATED_PULSE_EVENT(96, 8),
    UPDATE_IGNORE_LIST(97, -2),
    REFLECTION_CHECK(98, -2),
    RUN_CS2_SCRIPT(99, -2),
    CLEAR_VARPS(100, 0),
    FRIENDLIST_LOADED(101, 0), //something with setting a number to 1 and refreshing interfaces? ignore list related? FRIENDLIST_LOADED?
    UPDATE_REBOOT_TIMER(102, 2),
    WORLD_LIST(103, -2),
    VORBIS_SPEECH_SOUND(104, 6),
    IF_SETCOLOR(105, 6),
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
    IF_SETEVENTS(121, 12),
    RESET_ALL_ANIMATIONS(122, 0),
    VARCLAN_SET_BYTE(123, 3),
    IF_SETTEXT(124, -2),
    REMOVE_GROUND_ITEM(125, 3),
    SPOT_ANIM_SPECIFIC(126, 12),
    FRIENDS_CHAT_CHANNEL(127, -2),
    MIDI_SONG_LOCATION(128, 6),
    SET_TARGET(129, 2),
    IF_SETPLAYERHEAD_IGNOREWORN(130, 10),
    MESSAGE_QUICKCHAT_CLANCHANNEL(131, -1),
    IF_SETRETEX(132, 9),
    MESSAGE_PLAYER_GROUP(133, -1),
    aClass375_4453(134, 2), //SOUND_MIXBUSS_SETLEVEL? Changes array of 16 values having to do with sound (volumes?)
    IF_SETMODEL(135, 8),
    SOUND_SYNTH(136, 8),
    CLANSETTINGS_FULL(137, -2),
    ADD_IGNORE(138, -1),
    SPOT_ANIM(139, 8),
    UPDATE_STAT(140, 6),
    VARCLAN_SET_INT(141, 6),
    MESSAGE_QUICKCHAT_FRIENDS_CHAT(142, -1),
    MAP_PROJANIM(143, 16),
    IF_SETRECOL(144, 9),
    ANIMATE_NPC(145, 19),
    TRIGGER_ONDIALOGABORT(146, 0), //load last interface? no idea maybe IF_SETEVENTS as it adds hook events to them somehow?
    IDENTIFY_HOST_NAME(147, 4),
    IF_SETTARGETPARAM(148, 10),
    HINT_TRAIL(149, -2),
    IF_SETCLICKMASK(150, 5),
    SET_DRAW_ORDER(151, 1),
    MESSAGE_PUBLIC(152, -1),
    SET_CURSOR(153, -1),
    BLOCK_MINIMAP_STATE(154, 1),
    IF_OPENSUB_ACTIVE_GROUNDITEM(155, 29),
    aClass375_4507(156, -2), //calls a javascript method?..
    UPDATE_DOB(157, 4),
    IF_SETPLAYERHEAD_OTHER(158, 10),
    REQUEST_FPS(159, 8),
    GAME_MESSAGE(160, -1),
    DISCORD_RICH_PRESENCE_UPDATE(161, -1);

    private static final Map<Integer, ServerProt> OPCODE_MAP = new HashMap<>();

    static {
        for (ServerProt p : ServerProt.values())
            OPCODE_MAP.put(p.opcode, p);
    }

    public final int opcode;
    public final int size;

    ServerProt(int opcode, int size) {
        this.opcode = opcode;
        this.size = size;
    }

    public static ServerProt forId(int opcode) {
        return OPCODE_MAP.get(opcode);
    }
}
