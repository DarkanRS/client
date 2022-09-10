package com.jagex;

import java.util.Iterator;
import java.util.List;

public class GraphNode_Sub1_Sub4_Sub1 extends GraphNode_Sub1_Sub4 implements WorldObject {

    LocationIndexLoader aClass474_10489;
    int anInt10482;
    boolean aBool10488;
    byte aByte10487;
    byte aByte10485;
    boolean aBool10481;
    boolean aBool10490;
    MeshRasterizer aMeshRasterizer_10483;
    Shadow aCacheableNode_Sub17_10486;
    Class200 aClass200_10484;

    public GraphNode_Sub1_Sub4_Sub1(SceneObjectManager sceneobjectmanager_1, AbstractRenderer graphicalrenderer_2, LocationIndexLoader objectindexloader_3, ObjectDefinition objectdefinitions_4, int i_5, int i_6, int i_7, int i_8, int i_9, boolean bool_10, int i_11, int i_12, int i_13, int i_14) {
        super(sceneobjectmanager_1, i_7, i_8, i_9, i_5, i_6, i_11, i_12);
        aClass474_10489 = objectindexloader_3;
        anInt10482 = objectdefinitions_4.id;
        aBool10488 = bool_10;
        aByte10487 = (byte) i_14;
        aByte10485 = (byte) i_13;
        aBool10481 = objectdefinitions_4.interactable != 0 && !bool_10;
        aBool10490 = graphicalrenderer_2.method8402() && objectdefinitions_4.aBool5703 && !aBool10488 && Class393.preferences.sceneryShadows.method12624() != 0;
        int i_15 = 2048;
        if (objectdefinitions_4.aBool5711) {
            i_15 |= 0x80000;
        }

        Class452 class452_16 = method16069(graphicalrenderer_2, i_15, aBool10490);
        if (class452_16 != null) {
            aMeshRasterizer_10483 = (MeshRasterizer) class452_16.anObject5443;
            aCacheableNode_Sub17_10486 = (Shadow) class452_16.anObject5444;
            if (objectdefinitions_4.aBool5711) {
                aMeshRasterizer_10483 = aMeshRasterizer_10483.method11289((byte) 0, i_15, false);
                if (objectdefinitions_4.aBool5711) {
                    Class341 class341_17 = IndexLoaders.MAP_REGION_DECODER.method4426();
                    aMeshRasterizer_10483.PA(class341_17.anInt3992, class341_17.anInt3993, class341_17.anInt3994, class341_17.anInt3995);
                }
            }
        }

        method13008(1);
    }

    static void iComponentOnGroundTile(AbstractRenderer graphicalrenderer_0, int i_1, int i_2) {
        if (i_1 >= 0 && i_2 >= 0 && Class20.aClass384_158 != null) {
            CoordGrid coordgrid_4 = IndexLoaders.MAP_REGION_DECODER.getBase();
            Matrix44 matrix44_5 = graphicalrenderer_0.method8449();
            graphicalrenderer_0.method8424(Class20.aClass384_158);
            graphicalrenderer_0.method8457(Class20.aClass294_155);
            graphicalrenderer_0.r(Class20.anInt180, Class20.anInt181, Class20.anInt180 + Class20.anInt176, Class20.anInt184 + Class20.anInt181);
            graphicalrenderer_0.method8617(Class20.anInt180, Class20.anInt181, Class20.anInt176, Class20.anInt184);
            matrix44_5.fromVarMatrix44(Class20.aClass294_155);
            matrix44_5.method6523(Class20.aClass384_158);
            matrix44_5.method6524();
            int i_6 = i_1 - Class20.anInt180;
            int i_7 = i_2 - Class20.anInt181;
            int i_9;
            int i_21;
            int i_22;
            int i_51;
            if (IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager() != null && (!client.IS_USE_SELECTED || (Class506.USE_OPTIONS_FLAGS & 0x40) != 0)) {
                int i_8 = -1;
                i_9 = -1;
                float f_10 = 2.0F * i_6 / Class20.anInt176 - 1.0F;
                float f_11 = 2.0F * i_7 / Class20.anInt184 - 1.0F;
                matrix44_5.method6527(f_10, f_11, -1.0f, Class20.aFloatArray194);
                float f_12 = Class20.aFloatArray194[0] / Class20.aFloatArray194[3];
                float f_13 = Class20.aFloatArray194[1] / Class20.aFloatArray194[3];
                float f_14 = Class20.aFloatArray194[2] / Class20.aFloatArray194[3];
                matrix44_5.method6527(f_10, f_11, 1.0F, Class20.aFloatArray194);
                float f_15 = Class20.aFloatArray194[0] / Class20.aFloatArray194[3];
                float f_16 = Class20.aFloatArray194[1] / Class20.aFloatArray194[3];
                float f_17 = Class20.aFloatArray194[2] / Class20.aFloatArray194[3];
                float f_18 = Class4.method288(f_12, f_13, f_14, f_15, f_16, f_17, 4);
                if (f_18 > 0.0F) {
                    float f_19 = f_15 - f_12;
                    float f_20 = f_17 - f_14;
                    i_21 = (int) (f_19 * f_18 + f_12);
                    i_22 = (int) (f_18 * f_20 + f_14);
                    i_8 = i_21 + (VertexNormal.MY_PLAYER.getSize() - 1 << 8) >> 9;
                    i_9 = i_22 + (VertexNormal.MY_PLAYER.getSize() - 1 << 8) >> 9;
                    byte b_23 = VertexNormal.MY_PLAYER.plane;
                    if (b_23 < 3 && (IndexLoaders.MAP_REGION_DECODER.getRenderFlags().tileMasks[1][i_21 >> 9][i_22 >> 9] & 0x2) != 0) {
                        i_51 = b_23 + 1;
                    }
                }

                if (i_8 != -1 && i_9 != -1) {
                    if (client.IS_USE_SELECTED && (Class506.USE_OPTIONS_FLAGS & 0x40) != 0) {
                        IComponentDefinitions icomponentdefinitions_30 = Index.getIComponentDefinitions(client.anInt56, client.anInt7345);
                        if (icomponentdefinitions_30 != null) {
                            PlayerModel.method4032(client.aString7275, " -> ", Defaults8Loader.anInt5932, 59, -1, 0L, i_8, i_9, true, false, i_8 << 0 | i_9, true);
                        } else {
                            Class60.method1170();
                        }
                    } else {
                        if (CutsceneAction_Sub6.SHOW_FACE_HERE) {
                            PlayerModel.method4032(LocalizedText.FACE_HERE.translate(Class223.CURRENT_LANGUAGE), "", -1, 60, -1, 0L, i_8, i_9, true, false, i_8 << 0 | i_9, true);
                        }

                        PlayerModel.method4032(Class85.aString817, "", client.anInt7311, 23, -1, 0L, i_8, i_9, true, false, i_8 << 0 | i_9, true);
                    }
                }
            }

            Login xlogin_31 = IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager().aClass284_2648;
            i_9 = i_1;
            int i_43 = i_2;
            List<Class285> list_32 = xlogin_31.aList3388;
            Iterator<Class285> iterator_33 = list_32.iterator();

            while (true) {
                int i_46;
                int i_47;
                ObjectDefinition objectdefinitions_57;
                WorldObject sceneobject_60;
                String[] arr_63;
                do {
                    Class285 class285_34;
                    do {
                        do {
                            do {
                                int i_28;
                                int i_38;
                                int i_42;
                                int i_49;
                                while (true) {
                                    Vector3 vector3_26;
                                    int i_41;
                                    while (true) {
                                        do {
                                            do {
                                                if (!iterator_33.hasNext()) {
                                                    return;
                                                }

                                                class285_34 = iterator_33.next();
                                            } while (!client.aBool7372 && class285_34.aTransform_Sub1_3391.plane != VertexNormal.MY_PLAYER.plane);
                                        } while (!class285_34.method5019(graphicalrenderer_0, i_9, i_43));

                                        boolean bool_44 = false;
                                        boolean bool_45 = false;
                                        if (class285_34.aTransform_Sub1_3391 instanceof GraphNode_Sub1_Sub1) {
                                            i_46 = ((GraphNode_Sub1_Sub1) class285_34.aTransform_Sub1_3391).aShort9458;
                                            i_47 = ((GraphNode_Sub1_Sub1) class285_34.aTransform_Sub1_3391).aShort9456;
                                        } else {
                                            Vector3 vector3_35 = class285_34.aTransform_Sub1_3391.method11166().coords;
                                            i_46 = (int) vector3_35.x >> 9;
                                            i_47 = (int) vector3_35.z >> 9;
                                        }

                                        if (!(class285_34.aTransform_Sub1_3391 instanceof PlayerEntity)) {
                                            break;
                                        }

                                        PlayerEntity player_58 = (PlayerEntity) class285_34.aTransform_Sub1_3391;
                                        i_49 = player_58.getSize();
                                        Vector3 vector3_36 = player_58.method11166().coords;
                                        if ((i_49 & 0x1) == 0 && ((int) vector3_36.x & 0x1ff) == 0 && ((int) vector3_36.z & 0x1ff) == 0 || (i_49 & 0x1) == 1 && ((int) vector3_36.x & 0x1ff) == 256 && ((int) vector3_36.z & 0x1ff) == 256) {
                                            i_21 = (int) vector3_36.x - (player_58.getSize() - 1 << 8);
                                            i_22 = (int) vector3_36.z - (player_58.getSize() - 1 << 8);

                                            for (i_51 = 0; i_51 < client.NPC_UPDATE_INDEX; i_51++) {
                                                ObjectNode class282_sub47_24 = (ObjectNode) client.NPC_MAP.get(client.NPC_UPDATE_INDICES[i_51]);
                                                if (class282_sub47_24 != null) {
                                                    NPCEntity npc_40 = (NPCEntity) class282_sub47_24.anObject8068;
                                                    if (npc_40.anInt10375 != client.FRAME_COUNT && npc_40.aBool10318) {
                                                        vector3_26 = npc_40.method11166().coords;
                                                        i_41 = (int) vector3_26.x - (npc_40.definitions.size - 1 << 8);
                                                        i_28 = (int) vector3_26.z - (npc_40.definitions.size - 1 << 8);
                                                        if (i_41 >= i_21 && npc_40.definitions.size <= player_58.getSize() - (i_41 - i_21 >> 9) && i_28 >= i_22 && npc_40.definitions.size <= player_58.getSize() - (i_28 - i_22 >> 9)) {
                                                            MapAreaDefinitions.iComponentOnNPC(npc_40, class285_34.aTransform_Sub1_3391.plane != VertexNormal.MY_PLAYER.plane);
                                                            npc_40.anInt10375 = client.FRAME_COUNT;
                                                        }
                                                    }
                                                }
                                            }

                                            i_51 = Class197.NUM_PLAYER_INDICES;
                                            int[] ints_53 = Class197.PLAYER_INDICES;

                                            for (int i_25 = 0; i_25 < i_51; i_25++) {
                                                PlayerEntity player_55 = client.players[ints_53[i_25]];
                                                if (player_55 != null && player_55.anInt10375 != client.FRAME_COUNT && player_58 != player_55 && player_55.aBool10318) {
                                                    Vector3 vector3_27 = player_55.method11166().coords;
                                                    i_28 = (int) vector3_27.x - (player_55.getSize() - 1 << 8);
                                                    int i_29 = (int) vector3_27.z - (player_55.getSize() - 1 << 8);
                                                    if (i_28 >= i_21 && player_55.getSize() <= player_58.getSize() - (i_28 - i_21 >> 9) && i_29 >= i_22 && player_55.getSize() <= player_58.getSize() - (i_29 - i_22 >> 9)) {
                                                        CutsceneAction_Sub22.iComponentOnPlayer(player_55, class285_34.aTransform_Sub1_3391.plane != VertexNormal.MY_PLAYER.plane);
                                                        player_55.anInt10375 = client.FRAME_COUNT;
                                                    }
                                                }
                                            }
                                        }

                                        if (player_58.anInt10375 != client.FRAME_COUNT) {
                                            CutsceneAction_Sub22.iComponentOnPlayer(player_58, class285_34.aTransform_Sub1_3391.plane != VertexNormal.MY_PLAYER.plane);
                                            player_58.anInt10375 = client.FRAME_COUNT;
                                            break;
                                        }
                                    }

                                    if (!(class285_34.aTransform_Sub1_3391 instanceof NPCEntity)) {
                                        break;
                                    }

                                    NPCEntity npc_59 = (NPCEntity) class285_34.aTransform_Sub1_3391;
                                    if (npc_59.definitions == null) {
                                        break;
                                    }

                                    Vector3 vector3_56 = npc_59.method11166().coords;
                                    if ((npc_59.definitions.size & 0x1) == 0 && ((int) vector3_56.x & 0x1ff) == 0 && ((int) vector3_56.z & 0x1ff) == 0 || (npc_59.definitions.size & 0x1) == 1 && ((int) vector3_56.x & 0x1ff) == 256 && ((int) vector3_56.z & 0x1ff) == 256) {
                                        int i_50 = (int) vector3_56.x - (npc_59.definitions.size - 1 << 8);
                                        i_21 = (int) vector3_56.z - (npc_59.definitions.size - 1 << 8);

                                        for (i_22 = 0; i_22 < client.NPC_UPDATE_INDEX; i_22++) {
                                            ObjectNode class282_sub47_37 = (ObjectNode) client.NPC_MAP.get(client.NPC_UPDATE_INDICES[i_22]);
                                            if (class282_sub47_37 != null) {
                                                NPCEntity npc_54 = (NPCEntity) class282_sub47_37.anObject8068;
                                                if (npc_54.anInt10375 != client.FRAME_COUNT && npc_59 != npc_54 && npc_54.aBool10318) {
                                                    Vector3 vector3_66 = npc_54.method11166().coords;
                                                    i_42 = (int) vector3_66.x - (npc_54.definitions.size - 1 << 8);
                                                    i_41 = (int) vector3_66.z - (npc_54.definitions.size - 1 << 8);
                                                    if (i_42 >= i_50 && npc_54.definitions.size <= npc_59.definitions.size - (i_42 - i_50 >> 9) && i_41 >= i_21 && npc_54.definitions.size <= npc_59.definitions.size - (i_41 - i_21 >> 9)) {
                                                        MapAreaDefinitions.iComponentOnNPC(npc_54, class285_34.aTransform_Sub1_3391.plane != VertexNormal.MY_PLAYER.plane);
                                                        npc_54.anInt10375 = client.FRAME_COUNT;
                                                    }
                                                }
                                            }
                                        }

                                        i_22 = Class197.NUM_PLAYER_INDICES;
                                        int[] ints_64 = Class197.PLAYER_INDICES;

                                        for (i_38 = 0; i_38 < i_22; i_38++) {
                                            PlayerEntity player_67 = client.players[ints_64[i_38]];
                                            if (player_67 != null && player_67.anInt10375 != client.FRAME_COUNT && player_67.aBool10318) {
                                                vector3_26 = player_67.method11166().coords;
                                                i_41 = (int) vector3_26.x - (player_67.getSize() - 1 << 8);
                                                i_28 = (int) vector3_26.z - (player_67.getSize() - 1 << 8);
                                                if (i_41 >= i_50 && player_67.getSize() <= npc_59.definitions.size - (i_41 - i_50 >> 9) && i_28 >= i_21 && player_67.getSize() <= npc_59.definitions.size - (i_28 - i_21 >> 9)) {
                                                    CutsceneAction_Sub22.iComponentOnPlayer(player_67, class285_34.aTransform_Sub1_3391.plane != VertexNormal.MY_PLAYER.plane);
                                                    player_67.anInt10375 = client.FRAME_COUNT;
                                                }
                                            }
                                        }
                                    }

                                    if (npc_59.anInt10375 != client.FRAME_COUNT) {
                                        MapAreaDefinitions.iComponentOnNPC(npc_59, class285_34.aTransform_Sub1_3391.plane != VertexNormal.MY_PLAYER.plane);
                                        npc_59.anInt10375 = client.FRAME_COUNT;
                                        break;
                                    }
                                }

                                if (class285_34.aTransform_Sub1_3391 instanceof GroundItem) {
                                    int i_48 = i_46 + coordgrid_4.x;
                                    i_49 = i_47 + coordgrid_4.y;
                                    Node_Sub29 class282_sub29_61 = (Node_Sub29) client.aClass465_7414.get(class285_34.aTransform_Sub1_3391.plane << 28 | i_49 << 14 | i_48);
                                    if (class282_sub29_61 != null) {
                                        i_21 = 0;

                                        for (GroundItemNode class282_sub34_39 = (GroundItemNode) class282_sub29_61.aClass482_7708.method8065(); class282_sub34_39 != null; i_21++) {
                                            ItemDefinitions itemdefinitions_65 = IndexLoaders.ITEM_LOADER.getItemDefinitions(class282_sub34_39.id);
                                            if (itemdefinitions_65.hasTooltipColor) {
                                                i_38 = itemdefinitions_65.tooltipColor;
                                            } else if (itemdefinitions_65.membersOnly) {
                                                i_38 = Class149_Sub2.DEFAULTS_LOADER_7.membersTooltipColor;
                                            } else {
                                                i_38 = Class149_Sub2.DEFAULTS_LOADER_7.f2pTooltipColor;
                                            }

                                            if (client.IS_USE_SELECTED && class285_34.aTransform_Sub1_3391.plane == VertexNormal.MY_PLAYER.plane) {
                                                ParamDefinitions attributedefault_68 = CutsceneAction_Sub12.TARGET_PARAM != -1 ? IndexLoaders.PARAM_LOADER.getParam(CutsceneAction_Sub12.TARGET_PARAM) : null;
                                                if ((Class506.USE_OPTIONS_FLAGS & 0x1) != 0 && (attributedefault_68 == null || itemdefinitions_65.getCS2Integer(CutsceneAction_Sub12.TARGET_PARAM, attributedefault_68.defaultInt) != attributedefault_68.defaultInt)) {
                                                    PlayerModel.method4032(client.aString7275, client.aString7356 + " " + "->" + " " + Utils.rgbToColHexShortcut(i_38) + itemdefinitions_65.name, Defaults8Loader.anInt5932, 17, -1, class282_sub34_39.id, i_46, i_47, true, false, i_21, false);
                                                }
                                            }

                                            if (class285_34.aTransform_Sub1_3391.plane == VertexNormal.MY_PLAYER.plane) {
                                                String[] arr_69 = itemdefinitions_65.groundOptions;

                                                for (i_42 = arr_69.length - 1; i_42 >= 0; --i_42) {
                                                    if (arr_69[i_42] != null) {
                                                        short s_70 = 0;
                                                        i_28 = client.anInt7342;
                                                        if (i_42 == 0) {
                                                            s_70 = 18;
                                                        }

                                                        if (i_42 == 1) {
                                                            s_70 = 19;
                                                        }

                                                        if (i_42 == 2) {
                                                            s_70 = 20;
                                                        }

                                                        if (i_42 == 3) {
                                                            s_70 = 21;
                                                        }

                                                        if (i_42 == 4) {
                                                            s_70 = 22;
                                                        }

                                                        if (i_42 == 5) {
                                                            s_70 = 1004;
                                                        }

                                                        if (i_42 == itemdefinitions_65.unknownInt18) {
                                                            i_28 = itemdefinitions_65.unknownInt19;
                                                        }

                                                        if (i_42 == itemdefinitions_65.unknownInt20) {
                                                            i_28 = itemdefinitions_65.unknownInt21;
                                                        }

                                                        PlayerModel.method4032(arr_69[i_42], Utils.rgbToColHexShortcut(i_38) + itemdefinitions_65.name, i_28, s_70, -1, class282_sub34_39.id, i_46, i_47, true, false, i_21, false);
                                                    }
                                                }
                                            }

                                            class282_sub34_39 = (GroundItemNode) class282_sub29_61.aClass482_7708.method8068();
                                        }
                                    }
                                }
                            } while (!(class285_34.aTransform_Sub1_3391 instanceof WorldObject));

                            sceneobject_60 = (WorldObject) class285_34.aTransform_Sub1_3391;
                            objectdefinitions_57 = IndexLoaders.MAP_REGION_DECODER.method4436().getObjectDefs(sceneobject_60.getId());
                            if (objectdefinitions_57.transformTo != null) {
                                objectdefinitions_57 = objectdefinitions_57.getMultiLoc(Class158_Sub1.PLAYER_VAR_PROVIDER);
                            }
                        } while (objectdefinitions_57 == null);

                        if (client.IS_USE_SELECTED && class285_34.aTransform_Sub1_3391.plane == VertexNormal.MY_PLAYER.plane) {
                            ParamDefinitions attributedefault_62 = CutsceneAction_Sub12.TARGET_PARAM != -1 ? IndexLoaders.PARAM_LOADER.getParam(CutsceneAction_Sub12.TARGET_PARAM) : null;
                            if ((Class506.USE_OPTIONS_FLAGS & 0x4) != 0 && (attributedefault_62 == null || objectdefinitions_57.method7963(CutsceneAction_Sub12.TARGET_PARAM, attributedefault_62.defaultInt) != attributedefault_62.defaultInt)) {
                                PlayerModel.method4032(client.aString7275, client.aString7356 + " " + "->" + " " + Utils.rgbToColHexShortcut(65535) + objectdefinitions_57.name, Defaults8Loader.anInt5932, 2, -1, Class329.method5905(sceneobject_60, i_46, i_47), i_46, i_47, true, false, sceneobject_60.hashCode(), false);
                            }
                        }
                    } while (class285_34.aTransform_Sub1_3391.plane != VertexNormal.MY_PLAYER.plane);

                    arr_63 = objectdefinitions_57.options;
                } while (arr_63 == null);

                for (i_21 = arr_63.length - 1; i_21 >= 0; --i_21) {
                    if (arr_63[i_21] != null) {
                        short s_52 = 0;
                        i_51 = client.anInt7342;
                        if (i_21 == 0) {
                            s_52 = 3;
                        }

                        if (i_21 == 1) {
                            s_52 = 4;
                        }

                        if (i_21 == 2) {
                            s_52 = 5;
                        }

                        if (i_21 == 3) {
                            s_52 = 6;
                        }

                        if (i_21 == 4) {
                            s_52 = 1001;
                        }

                        if (i_21 == 5) {
                            s_52 = 1002;
                        }

                        if (i_21 == objectdefinitions_57.anInt5705) {
                            i_51 = objectdefinitions_57.anInt5665;
                        }

                        if (i_21 == objectdefinitions_57.anInt5670) {
                            i_51 = objectdefinitions_57.anInt5666;
                        }

                        PlayerModel.method4032(arr_63[i_21], Utils.rgbToColHexShortcut(65535) + objectdefinitions_57.name, i_51, s_52, -1, Class329.method5905(sceneobject_60, i_46, i_47), i_46, i_47, true, false, sceneobject_60.hashCode(), false);
                    }
                }
            }
        }
    }

    @Override
    public int method76() {
        return anInt10482 * 1535728455 * 462020215;
    }

    @Override
    boolean method12986() {
        return aMeshRasterizer_10483 == null || !aMeshRasterizer_10483.u();
    }

    @Override
    boolean method12987() {
        return aMeshRasterizer_10483 != null && aMeshRasterizer_10483.i();
    }

    @Override
    public int method12995() {
        return aMeshRasterizer_10483 != null ? aMeshRasterizer_10483.YA() : 0;
    }

    MeshRasterizer method16068(AbstractRenderer graphicalrenderer_1, int i_2) {
        if (aMeshRasterizer_10483 != null && graphicalrenderer_1.method8452(aMeshRasterizer_10483.m(), i_2) == 0) {
            return aMeshRasterizer_10483;
        } else {
            Class452 class452_4 = method16069(graphicalrenderer_1, i_2, false);
            return class452_4 != null ? (MeshRasterizer) class452_4.anObject5443 : null;
        }
    }

    Class452 method16069(AbstractRenderer graphicalrenderer_1, int i_2, boolean bool_3) {
        ObjectDefinition objectdefinitions_5 = aClass474_10489.getObjectDefs(anInt10482);
        Ground class390_6;
        Ground class390_7;
        if (aBool10488) {
            class390_6 = aClass206_7970.aGroundArray2614[collisionPlane];
            class390_7 = aClass206_7970.aGroundArray2607[0];
        } else {
            class390_6 = aClass206_7970.aGroundArray2607[collisionPlane];
            if (collisionPlane < 3) {
                class390_7 = aClass206_7970.aGroundArray2607[collisionPlane + 1];
            } else {
                class390_7 = null;
            }
        }

        Vector3 vector3_8 = method11166().coords;
        return objectdefinitions_5.method8010(graphicalrenderer_1, i_2, aByte10485, aByte10487, class390_6, class390_7, (int) vector3_8.x, (int) vector3_8.y, (int) vector3_8.z, bool_3, null);
    }

    @Override
    public void method90() {
        if (aMeshRasterizer_10483 != null) {
            aMeshRasterizer_10483.method11259();
        }

    }

    @Override
    Class285 method12990(AbstractRenderer graphicalrenderer_1) {
        if (aMeshRasterizer_10483 == null) {
            return null;
        } else {
            Matrix44Var matrix44var_3 = graphicalrenderer_1.method8450();
            matrix44var_3.method5209(method11168());
            matrix44var_3.method5219(aShort9611, 0.0F, aShort9612);
            Class285 class285_4 = Class470.method7824(aBool10481);
            aMeshRasterizer_10483.method11282(matrix44var_3, boundingBoxPolygons[0], 0);
            return class285_4;
        }
    }

    @Override
    void method12991(AbstractRenderer graphicalrenderer_1) {
    }

    @Override
    boolean method12983(AbstractRenderer graphicalrenderer_1, int i_2, int i_3) {
        MeshRasterizer meshrasterizer_5 = method16068(graphicalrenderer_1, 131072);
        if (meshrasterizer_5 != null) {
            Matrix44Var matrix44var_6 = method11168();
            return meshrasterizer_5.method11270(i_2, i_3, matrix44var_6, false, 0);
        } else {
            return false;
        }
    }

    @Override
    public int method13005() {
        return aMeshRasterizer_10483 != null ? aMeshRasterizer_10483.YA() : 0;
    }

    @Override
    public int method92() {
        return aByte10487;
    }

    @Override
    public void method85() {
        if (aMeshRasterizer_10483 != null) {
            aMeshRasterizer_10483.method11259();
        }

    }

    @Override
    Class285 method12989(AbstractRenderer graphicalrenderer_1) {
        if (aMeshRasterizer_10483 == null) {
            return null;
        } else {
            Matrix44Var matrix44var_2 = graphicalrenderer_1.method8450();
            matrix44var_2.method5209(method11168());
            matrix44var_2.method5219(aShort9611, 0.0F, aShort9612);
            Class285 class285_3 = Class470.method7824(aBool10481);
            aMeshRasterizer_10483.method11282(matrix44var_2, boundingBoxPolygons[0], 0);
            return class285_3;
        }
    }

    @Override
    public void method87(AbstractRenderer graphicalrenderer_1) {
        Object obj_3 = null;
        Shadow class282_sub50_sub17_4;
        if (aCacheableNode_Sub17_10486 == null && aBool10490) {
            Class452 class452_5 = method16069(graphicalrenderer_1, 262144, true);
            class282_sub50_sub17_4 = (Shadow) (class452_5 != null ? class452_5.anObject5444 : null);
        } else {
            class282_sub50_sub17_4 = aCacheableNode_Sub17_10486;
            aCacheableNode_Sub17_10486 = null;
        }

        Vector3 vector3_6 = method11166().coords;
        if (class282_sub50_sub17_4 != null) {
            aClass206_7970.method3426(class282_sub50_sub17_4, collisionPlane, (int) vector3_6.x, (int) vector3_6.z, null);
        }

    }

    @Override
    public void method88(AbstractRenderer graphicalrenderer_1) {
        Object obj_3 = null;
        Shadow class282_sub50_sub17_4;
        if (aCacheableNode_Sub17_10486 == null && aBool10490) {
            Class452 class452_5 = method16069(graphicalrenderer_1, 262144, true);
            class282_sub50_sub17_4 = (Shadow) (class452_5 != null ? class452_5.anObject5444 : null);
        } else {
            class282_sub50_sub17_4 = aCacheableNode_Sub17_10486;
            aCacheableNode_Sub17_10486 = null;
        }

        Vector3 vector3_6 = method11166().coords;
        if (class282_sub50_sub17_4 != null) {
            aClass206_7970.method3427(class282_sub50_sub17_4, collisionPlane, (int) vector3_6.x, (int) vector3_6.z, null);
        }

    }

    @Override
    boolean method13002() {
        return aMeshRasterizer_10483 != null && aMeshRasterizer_10483.i();
    }

    @Override
    public int method39() {
        return anInt10482 * 1535728455 * 462020215;
    }

    @Override
    public int method73() {
        return aByte10485;
    }

    @Override
    boolean method12999() {
        return aMeshRasterizer_10483 == null || !aMeshRasterizer_10483.u();
    }

    @Override
    public int method91() {
        return aByte10487;
    }

    @Override
    public void method38() {
        if (aMeshRasterizer_10483 != null) {
            aMeshRasterizer_10483.method11259();
        }

    }

    @Override
    public void method96() {
        if (aMeshRasterizer_10483 != null) {
            aMeshRasterizer_10483.method11259();
        }

    }

    @Override
    public Class200 method12992(AbstractRenderer graphicalrenderer_1) {
        Vector3 vector3_3 = method11166().coords;
        if (aClass200_10484 == null) {
            aClass200_10484 = EntityNode_Sub2.method12505((int) vector3_3.x, (int) vector3_3.y, (int) vector3_3.z, method16068(graphicalrenderer_1, 0));
        }

        return aClass200_10484;
    }

    @Override
    public boolean method94() {
        return aBool10490;
    }

    @Override
    boolean method13000() {
        return aMeshRasterizer_10483 != null && aMeshRasterizer_10483.i();
    }

    @Override
    public void method93(AbstractRenderer graphicalrenderer_1) {
        Object obj_2 = null;
        Shadow class282_sub50_sub17_3;
        if (aCacheableNode_Sub17_10486 == null && aBool10490) {
            Class452 class452_4 = method16069(graphicalrenderer_1, 262144, true);
            class282_sub50_sub17_3 = (Shadow) (class452_4 != null ? class452_4.anObject5444 : null);
        } else {
            class282_sub50_sub17_3 = aCacheableNode_Sub17_10486;
            aCacheableNode_Sub17_10486 = null;
        }

        Vector3 vector3_5 = method11166().coords;
        if (class282_sub50_sub17_3 != null) {
            aClass206_7970.method3426(class282_sub50_sub17_3, collisionPlane, (int) vector3_5.x, (int) vector3_5.z, null);
        }

    }

    @Override
    public void method83(AbstractRenderer graphicalrenderer_1) {
        Object obj_2 = null;
        Shadow class282_sub50_sub17_3;
        if (aCacheableNode_Sub17_10486 == null && aBool10490) {
            Class452 class452_4 = method16069(graphicalrenderer_1, 262144, true);
            class282_sub50_sub17_3 = (Shadow) (class452_4 != null ? class452_4.anObject5444 : null);
        } else {
            class282_sub50_sub17_3 = aCacheableNode_Sub17_10486;
            aCacheableNode_Sub17_10486 = null;
        }

        Vector3 vector3_5 = method11166().coords;
        if (class282_sub50_sub17_3 != null) {
            aClass206_7970.method3426(class282_sub50_sub17_3, collisionPlane, (int) vector3_5.x, (int) vector3_5.z, null);
        }

    }

    @Override
    public void method97(AbstractRenderer graphicalrenderer_1) {
        Object obj_2 = null;
        Shadow class282_sub50_sub17_3;
        if (aCacheableNode_Sub17_10486 == null && aBool10490) {
            Class452 class452_4 = method16069(graphicalrenderer_1, 262144, true);
            class282_sub50_sub17_3 = (Shadow) (class452_4 != null ? class452_4.anObject5444 : null);
        } else {
            class282_sub50_sub17_3 = aCacheableNode_Sub17_10486;
            aCacheableNode_Sub17_10486 = null;
        }

        Vector3 vector3_5 = method11166().coords;
        if (class282_sub50_sub17_3 != null) {
            aClass206_7970.method3427(class282_sub50_sub17_3, collisionPlane, (int) vector3_5.x, (int) vector3_5.z, null);
        }

    }

    @Override
    public int getId() {
        return anInt10482;
    }

    @Override
    public void method98(AbstractRenderer graphicalrenderer_1) {
        Object obj_2 = null;
        Shadow class282_sub50_sub17_3;
        if (aCacheableNode_Sub17_10486 == null && aBool10490) {
            Class452 class452_4 = method16069(graphicalrenderer_1, 262144, true);
            class282_sub50_sub17_3 = (Shadow) (class452_4 != null ? class452_4.anObject5444 : null);
        } else {
            class282_sub50_sub17_3 = aCacheableNode_Sub17_10486;
            aCacheableNode_Sub17_10486 = null;
        }

        Vector3 vector3_5 = method11166().coords;
        if (class282_sub50_sub17_3 != null) {
            aClass206_7970.method3427(class282_sub50_sub17_3, collisionPlane, (int) vector3_5.x, (int) vector3_5.z, null);
        }

    }

    @Override
    public boolean method86() {
        return aBool10490;
    }

    @Override
    public Class200 method12993(AbstractRenderer graphicalrenderer_1) {
        Vector3 vector3_2 = method11166().coords;
        if (aClass200_10484 == null) {
            aClass200_10484 = EntityNode_Sub2.method12505((int) vector3_2.x, (int) vector3_2.y, (int) vector3_2.z, method16068(graphicalrenderer_1, 0));
        }

        return aClass200_10484;
    }

    @Override
    public int method77() {
        return aByte10485;
    }

    @Override
    public int method13003() {
        return aMeshRasterizer_10483 != null ? aMeshRasterizer_10483.YA() : 0;
    }

    @Override
    boolean method13001() {
        return aMeshRasterizer_10483 != null && aMeshRasterizer_10483.i();
    }

    @Override
    public boolean method95() {
        return aBool10490;
    }

    @Override
    public int method13006() {
        return aMeshRasterizer_10483 != null ? aMeshRasterizer_10483.YA() : 0;
    }

    @Override
    Class285 method13009(AbstractRenderer graphicalrenderer_1) {
        if (aMeshRasterizer_10483 == null) {
            return null;
        } else {
            Matrix44Var matrix44var_2 = graphicalrenderer_1.method8450();
            matrix44var_2.method5209(method11168());
            matrix44var_2.method5219(aShort9611, 0.0F, aShort9612);
            Class285 class285_3 = Class470.method7824(aBool10481);
            aMeshRasterizer_10483.method11282(matrix44var_2, boundingBoxPolygons[0], 0);
            return class285_3;
        }
    }

    @Override
    Class285 method13010(AbstractRenderer graphicalrenderer_1) {
        if (aMeshRasterizer_10483 == null) {
            return null;
        } else {
            Matrix44Var matrix44var_2 = graphicalrenderer_1.method8450();
            matrix44var_2.method5209(method11168());
            matrix44var_2.method5219(aShort9611, 0.0F, aShort9612);
            Class285 class285_3 = Class470.method7824(aBool10481);
            aMeshRasterizer_10483.method11282(matrix44var_2, boundingBoxPolygons[0], 0);
            return class285_3;
        }
    }

    @Override
    public Class200 method13019(AbstractRenderer graphicalrenderer_1) {
        Vector3 vector3_2 = method11166().coords;
        if (aClass200_10484 == null) {
            aClass200_10484 = EntityNode_Sub2.method12505((int) vector3_2.x, (int) vector3_2.y, (int) vector3_2.z, method16068(graphicalrenderer_1, 0));
        }

        return aClass200_10484;
    }

    @Override
    void method13012(AbstractRenderer graphicalrenderer_1) {
    }

    @Override
    public int method89() {
        return aByte10485;
    }

    @Override
    void method13023(AbstractRenderer graphicalrenderer_1) {
    }

    @Override
    public Class200 method13018(AbstractRenderer graphicalrenderer_1) {
        Vector3 vector3_2 = method11166().coords;
        if (aClass200_10484 == null) {
            aClass200_10484 = EntityNode_Sub2.method12505((int) vector3_2.x, (int) vector3_2.y, (int) vector3_2.z, method16068(graphicalrenderer_1, 0));
        }

        return aClass200_10484;
    }

    @Override
    public int method13017() {
        return aMeshRasterizer_10483 != null ? aMeshRasterizer_10483.YA() : 0;
    }

    @Override
    boolean method13020(AbstractRenderer graphicalrenderer_1, int i_2, int i_3) {
        MeshRasterizer meshrasterizer_4 = method16068(graphicalrenderer_1, 131072);
        if (meshrasterizer_4 != null) {
            Matrix44Var matrix44var_5 = method11168();
            return meshrasterizer_4.method11270(i_2, i_3, matrix44var_5, false, 0);
        } else {
            return false;
        }
    }
}
