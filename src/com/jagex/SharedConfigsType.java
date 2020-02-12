package com.jagex;

public enum SharedConfigsType {
    UNDERLAYS(1),
    SCT_2(2),
    IdentiKit(3),
    OVERLAYS(4),
    INVENTORIES(5),
    OBJECTS(6, 8),
    SCT_7(7),
    ENUMS(8, 8),
    NPCS(9, 7),
    ITEMS(10, 8),
    PARAMS(11),
    ANIMATIONS(12, 7),
    SPOT_ANIMS(13, 8),
    VARBITS(14, 10),
    VARC_STRING(15),
    VARS(16),
    SCT_17(17),
    SCT_18(18),
    VARC(19),
    SCT_20(20),
    SCT_21(21),
    SCT_22(22),
    SCT_23(23),
    VARN(24),
    VARNBIT(25),
    STRUCTS(26),
    SCT_27(27),
    SCT_28(28),
    SKYBOX(29),
    SUN(30),
    LIGHT_INTENSITIES(31),
    RENDER_ANIMS(32),
    CURSORS(33),
    MAP_SPRITES(34),
    QUESTS(35),
    MAP_AREAS(36),
    SCT_37(37),
    SCT_38(38),
    SCT_39(39),
    SCT_40(40),
    SCT_41(41),
    SCT_42(42),
    SCT_43(43),
    SCT_44(44),
    SCT_45(45),
    HITSPLATS(46),
    CLAN_VAR(47),
    SCT_48(48),
    SCT_49(49),
    SCT_50(50),
    SCT_51(51),
    SCT_53(53),
    CLAN_VAR_SETTINGS(54),
    SCT_70(70),
    HITBARS(72),
    SCT_73(73),
    SCT_74(74);

    public int id, bit;

    SharedConfigsType(int id) {
        this(id, 0);
    }

    SharedConfigsType(int id, int bit) {
        this.id = id;
        this.bit = bit;
    }

    public int filesPerContainer() {
        return 1 << this.bit;
    }

    public int containerId(int containerId) {
        return containerId >>> this.bit;
    }

    public int fileId(int fileId) {
        return fileId & (1 << this.bit) - 1;
    }
}
