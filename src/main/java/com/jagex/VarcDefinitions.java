package com.jagex;

public class VarcDefinitions {

    public static int CS2_QUERY_RESULTS_LEN;
    public int anInt4983 = 1;
    public char aChar4984;

    static void renderItemInvSprite(AbstractRenderer renderer, IComponentDefinitions comp) {
        boolean bool_3 = IndexLoaders.ITEM_LOADER.softwareRender(renderer, comp.containerItemId, comp.anInt1427, comp.borderThickness, -16777216 | comp.spriteShadow, comp.renderStack, comp.wearCol ? VertexNormal.MY_PLAYER.model : null) == null;
        if (bool_3) {
            Class182.ITEMS.append(new Item(comp.containerItemId, comp.anInt1427, comp.borderThickness, -16777216 | comp.spriteShadow, comp.renderStack, comp.wearCol));
            IComponentDefinitions.redrawComponent(comp);
        }
    }

    static void method6997(AbstractRenderer graphicalrenderer_0, ObjectDefinition objectdefinitions_1, int i_2, int i_3, int i_4) {
        int i_21 = i_2;
        MapSpriteDefinitions class418_6 = IndexLoaders.MAP_SPRITE_LOADER.method7172(objectdefinitions_1.mapSpriteId);
        if (class418_6.anInt4995 != -1) {
            if (objectdefinitions_1.adjustMapSceneRotation) {
                i_21 += objectdefinitions_1.mapSpriteRotation;
                i_21 &= 0x3;
            } else {
                i_21 = 0;
            }
            NativeSprite nativesprite_7 = class418_6.method7010(graphicalrenderer_0, i_21, objectdefinitions_1.flipMapSprite);
            if (nativesprite_7 != null) {
                int i_8 = objectdefinitions_1.sizeX;
                int i_9 = objectdefinitions_1.sizeY;
                if ((i_21 & 0x1) == 1) {
                    i_8 = objectdefinitions_1.sizeY;
                    i_9 = objectdefinitions_1.sizeX;
                }
                int i_10 = nativesprite_7.scaleWidth();
                int i_11 = nativesprite_7.method2748();
                if (class418_6.aBool4996) {
                    i_10 = i_8 * 4;
                    i_11 = i_9 * 4;
                }
                if (class418_6.anInt4997 != 0) {
                    nativesprite_7.method2754(i_3, i_4 - (i_9 - 1) * 4, i_10, i_11, 0, -16777216 | class418_6.anInt4997, 1);
                } else {
                    nativesprite_7.method2789(i_3, i_4 - (i_9 - 1) * 4, i_10, i_11);
                }
            }
        }
    }

    void method6990(ByteBuf rsbytebuffer_1) {
        while (true) {
            int i_3 = rsbytebuffer_1.readUnsignedByte();
            if (i_3 == 0) {
                return;
            }
            method6991(rsbytebuffer_1, i_3);
        }
    }

    void method6991(ByteBuf stream, int opcode) {
        if (opcode == 1) {
            aChar4984 = Utils.cp1252ToChar(stream.readByte());
        } else if (opcode == 2) {
            anInt4983 = 0;
        }
    }
}
